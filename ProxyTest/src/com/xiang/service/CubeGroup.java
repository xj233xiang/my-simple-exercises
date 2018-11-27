package com.xiang.service;

import com.xiang.domain.Cube;

public interface CubeGroup{
	public Cube[][] initGroup(int groupSize);
	public Cube[][] initGroup(int groupSize,Object params);
	public Cube[][] initGroup(int xSize, int ySize ,Object params);
	public Cube[][] initGroup(int xSize, int ySize ,int cubeLength,Object params);
	public Cube[][] initGroup(int xSize, int ySize ,int xLength,int yLength,Object params);
}
