package com.example.multipart.demo.integration;

public class LivenessData {

	private String livenessResult;
	private boolean glassesDecision;
	private Double glassesScore;
	private String sessionId;
	private Double livenessScore;

	public void setLivenessResult(String livenessResult){
		this.livenessResult = livenessResult;
	}

	public String getLivenessResult(){
		return livenessResult;
	}

	public void setGlassesDecision(boolean glassesDecision){
		this.glassesDecision = glassesDecision;
	}

	public boolean isGlassesDecision(){
		return glassesDecision;
	}

	public void setGlassesScore(Double glassesScore){
		this.glassesScore = glassesScore;
	}

	public Double getGlassesScore(){
		return glassesScore;
	}

	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}

	public String getSessionId(){
		return sessionId;
	}

	public void setLivenessScore(Double livenessScore){
		this.livenessScore = livenessScore;
	}

	public Double getLivenessScore(){
		return livenessScore;
	}

	@Override
 	public String toString(){
		return 
			"data{" +
			"livenessResult = '" + livenessResult + '\'' + 
			",glassesDecision = '" + glassesDecision + '\'' + 
			",glassesScore = '" + glassesScore + '\'' + 
			",sessionId = '" + sessionId + '\'' + 
			",livenessScore = '" + livenessScore + '\'' + 
			"}";
		}
}
