package com.example.multipart.demo.integration;

public class LivenessMeta {

	private boolean ok;
	private String message;
	private String status;

	public void setOk(boolean ok){
		this.ok = ok;
	}

	public boolean isOk(){
		return ok;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"meta{" +
			"ok = '" + ok + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
