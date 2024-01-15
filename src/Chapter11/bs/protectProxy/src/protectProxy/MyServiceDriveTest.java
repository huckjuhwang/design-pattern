package protectProxy;

import java.lang.reflect.Proxy;

public class MyServiceDriveTest {

	public class Main {
	    public static void main(String[] args) {
	        MyService myService1 = new MyServiceImpl("papago");
	        MyService proxy1 = (MyService) Proxy.newProxyInstance(
	            MyService.class.getClassLoader(),
	            new Class<?>[] { MyService.class },
	            new UserInvocationHandler(myService1));
	        try {
	        	proxy1.setName("papagomi");
		    } catch (Exception e) {
				System.out.println("이름을 바꿀 수 없어요");
			}
	        proxy1.performAction();
	        
	        MyService myService2 = new MyServiceImpl("admin");
	        MyService proxy2 = (MyService) Proxy.newProxyInstance(
	            MyService.class.getClassLoader(),
	            new Class<?>[] { MyService.class },
	            new AdminInvocationHandler(myService2));
	        try {
	        	proxy2.setName("Administrator");
		    } catch (Exception e) {
				System.out.println("이름을 바꿀 수 없어요");
			}
	        proxy2.performAction();
	        
	        MyService myService3 = new MyServiceImpl("KBS");
	        MyService proxy3 = (MyService) Proxy.newProxyInstance(
	            MyService.class.getClassLoader(),
	            new Class<?>[] { MyService.class },
	            new UserInvocationHandler(myService3));
	        try {
	        	proxy3.setName("SBS");
		    } catch (Exception e) {
				System.out.println("이름을 바꿀 수 없어요");
			}
	        proxy3.performAction();
	    }
	}
}
