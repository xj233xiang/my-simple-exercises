package com.xaing.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorldPlatEdit implements InvocationHandler{

	private Object object;
	
	public WorldPlatEdit() {
		// TODO Auto-generated constructor stub
	}
	public WorldPlatEdit(Object object) {
		this.object=object;
	}
	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("准备地图");
		Object result=paramMethod.invoke(object, paramArrayOfObject);
		System.out.println("地图模板生成完成，开始加工地图");
		return result;
	}
}
