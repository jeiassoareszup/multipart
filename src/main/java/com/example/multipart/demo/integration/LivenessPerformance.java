package com.example.multipart.demo.integration;

public class LivenessPerformance {

	private int bt;

	public void setBt(int bt){
		this.bt = bt;
	}

	public int getBt(){
		return bt;
	}

	@Override
 	public String toString(){
		return 
			"performance{" +
			"bt = '" + bt + '\'' + 
			"}";
		}
}
