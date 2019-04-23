package com.example.multipart.demo.integration;

public class LivenessResponse {

	private LivenessPerformance performance;
	private LivenessData data;
	private LivenessMeta meta;

	public void setPerformance(LivenessPerformance performance){
		this.performance = performance;
	}

	public LivenessPerformance getPerformance(){
		return performance;
	}

	public void setData(LivenessData data){
		this.data = data;
	}

	public LivenessData getData(){
		return data;
	}

	public void setMeta(LivenessMeta meta){
		this.meta = meta;
	}

	public LivenessMeta getMeta(){
		return meta;
	}

	@Override
 	public String toString(){
		return 
			"{" +
			"performance = '" + performance + '\'' + 
			",data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			"}";
		}
}
