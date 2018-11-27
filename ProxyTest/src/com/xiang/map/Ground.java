package com.xiang.map;

import java.time.Year;

public abstract class Ground {
	private int xLimit;
	private int yLimit;
	private int xInitRound;
	private int yInitRound;
	private GroundItem[][] ground;
	
	public Ground() {
		// TODO Auto-generated constructor stub
		xLimit=10;
		yLimit=10;
	}
	public Ground(int xLimit,int yLimit) {
		this.xLimit=xLimit;
		this.yLimit=yLimit;	
	}
	public void initGroud() {
		ground=new GroundItem[xLimit][yLimit];
	}
	public GroundItem[][] getCurrentGround(int xPosition, int yPosition, int xSize, int ySize ){
		if(xLimit<1||yLimit<1||xSize<1||ySize<1) {
			throw new GroundSizeException();
		}
		boolean isXSizeOdd=(xSize/2>0)?true:false;
		boolean isYSizeOdd=(ySize/2>0)?true:false;
		GroundItem[][] groundItems=new GroundItem[xSize][ySize];
		if(ground==null) {
			throw new GroundSizeException("ground is undifined");
		}else {
			
		}
		return groundItems;
	}
}
