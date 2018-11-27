package com.xiang.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.undo.CannotUndoException;

public class Cube {
	private int xPosition;
	private int yPosition;
	private int xLength;
	private int yLength;
	
	public Cube() {}
	
	public int getxPosition() {
		List list=new ArrayList<>();
		return xPosition;
		
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getxLength() {
		return xLength;
	}

	public void setxLength(int xLength) {
		this.xLength = xLength;
	}

	public int getyLength() {
		return yLength;
	}

	public void setyLength(int yLength) {
		this.yLength = yLength;
	}

	@Override
	public String toString() {
		return "Cube [xPosition(横坐标)=" + xPosition + ", yPosition(纵坐标)=" + yPosition + ", xLength(宽)=" + xLength + ", yLength(高)="
				+ yLength + "]";
	};
	
	
	
}
