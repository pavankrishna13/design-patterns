package com.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AddCommand implements Command {
	
	Object receiver;
	Method method;
	Object[] arguments;

	
	
	public AddCommand(Object receiver, String methodName, Object[] arguments) {
		super();
		this.receiver = receiver;
		this.arguments = arguments;
		
		Class<?> cls = receiver.getClass();
		Class<?>[] argTypes = new Class[arguments.length];
		for(int i = 0; i < argTypes.length; i++) {
			argTypes[i] = arguments[i].getClass();
		}
		
		try {
			this.method = cls.getMethod(methodName, argTypes);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void execute() {
		try {
			method.invoke(receiver, arguments);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
