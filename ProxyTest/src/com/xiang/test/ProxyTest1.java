package com.xiang.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.xaing.proxy.WorldPlatEdit;
import com.xiang.service.CubeGroup;
import com.xiang.service.impl.WorldPlat;

public class ProxyTest1 {
	public static void main(String[] args) {
		WorldPlat worldPlat=new WorldPlat();
		InvocationHandler iHandler=new WorldPlatEdit(worldPlat);
		CubeGroup dynamicProxy1=(CubeGroup)Proxy.newProxyInstance(WorldPlat.class.getClassLoader(), worldPlat.getClass().getInterfaces(),iHandler );
		dynamicProxy1.initGroup(2);
		dynamicProxy1.initGroup(2, null);
		dynamicProxy1.initGroup(2, 1, null);
		dynamicProxy1.initGroup(2, 1, 5, null);
		dynamicProxy1.initGroup(3, 1, 4, 4, null);
	}
}
