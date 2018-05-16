/**
 * 
 */
package com.verizon.bean;

/**
 * @author verizon
 *
 */
public class Message {
	
	private String header;
	private String body;
	
	public Message(){
		
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public Message(String header, String body) {
		this.header = header;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Message [header=" + header + ", body=" + body + "]";
	}
	

}