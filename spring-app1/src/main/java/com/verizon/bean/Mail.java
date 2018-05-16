/**
 * 
 */
package com.verizon.bean;

/**
 * @author verizon
 *
 */
public class Mail {
	private String fromAddress;
	private Message message;
	private String toAddress;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public String toString() {
		return "Mail [fromAddress=" + fromAddress + ", message=" + message + ", toAddress=" + toAddress + "]";
	}



	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	

}
