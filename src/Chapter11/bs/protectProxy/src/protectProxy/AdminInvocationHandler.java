package protectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AdminInvocationHandler implements InvocationHandler {
    private final MyService myService;

    public AdminInvocationHandler(MyService myService) {
        this.myService = myService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
    		throws IllegalAccessException {
    	try {
			if (method.getName().startsWith("get")) {
				return method.invoke(myService, args);
   			} else if (method.getName().startsWith("set")) {
   				return method.invoke(myService, args);
			} else {
				return method.invoke(myService, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        return null;
    }
}
