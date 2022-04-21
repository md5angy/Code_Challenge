package it.md5angy.model;


public class Echo_Request extends Generic_Entity {
	
	private long timestamp;
	private String message;
	
	
	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
