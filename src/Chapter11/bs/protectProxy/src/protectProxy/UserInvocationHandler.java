package protectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {
    private final MyService myService;

    public UserInvocationHandler(MyService myService) {
        this.myService = myService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
    		throws IllegalAccessException {
    	try {
			if (method.getName().startsWith("get")) {
				throw new IllegalAccessException();
   			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} else {
				return method.invoke(myService, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        return null;
    }
}
