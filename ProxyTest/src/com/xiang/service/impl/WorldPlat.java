package com.xiang.service.impl;

import com.xiang.domain.Cube;
import com.xiang.service.CubeGroup;

public class WorldPlat implements CubeGroup {


	@Override
	public Cube[][] initGroup(int groupSize) 
		throws IllegalAccessError{
		// TODO Auto-generated method stub
		if(groupSize<1) {
			throw new IllegalAccessError("地图大小不正确");
		}
		return this.initGroup(groupSize, groupSize, 1, 1, null);
	}
	@Override
	public Cube[][] initGroup(int groupSize, Object params)
		throws IllegalAccessError{
		if(groupSize<1) {
			throw new IllegalAccessError("地图大小不正确");
		}
		return initGroup(groupSize, groupSize, 1, 1, params);
	}
	@Override
	public Cube[][] initGroup(int xSize, int ySize, Object params) 
		throws IllegalAccessError{
		// TODO Auto-generated method stub
		if(xSize<1||ySize<1) {
			throw new IllegalAccessError("地图大小不正确");
		}
		return initGroup(xSize, ySize, 1, 1, params);
	}

	@Override
	public Cube[][] initGroup(int xSize, int ySize, int cubeLength, Object params) 
		throws IllegalAccessError{
		// TODO Auto-generated method stub
		if(xSize<1||ySize<1) {
			throw new IllegalAccessError("地图大小不正确");
		}
		if(cubeLength<1) {
			throw new IllegalAccessError("地图尺寸不对");
		}
		return initGroup(xSize, ySize, cubeLength, cubeLength, params);
	}

	@Override
	public Cube[][] initGroup(int xSize, int ySize, int xLength, int yLength, Object params) 
		throws IllegalAccessError{
		// TODO Auto-generated method stub
		if(xSize<1||ySize<1) {
			throw new IllegalAccessError("地图大小不正确");
		}
		if(xLength<1||yLength<1) {
			throw new IllegalAccessError("地图尺寸不对");
		}
		System.out.println("生成地图模板中");
		System.out.println("总计："+(xSize*ySize)+"地图碎片，横向"+xSize+"片,纵向"+ySize+"片,每片碎片的宽高："+xLength+","+yLength+"------");
		System.out.println("地图模板生成完成");
		return null;
	}
	

}
