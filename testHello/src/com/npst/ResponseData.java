package com.npst;


public class ResponseData {
	private String tid;
	private Object data;
	//private int enqueryCode;
	private int statusCode;
	private String txnTime;
	private String statusMsg;
	
	private String encryptedString;
	private String desc;
	
	public String getEncryptedString() {
		return encryptedString;
	}
	public void setEncryptedString(String encryptedString) {
		this.encryptedString = encryptedString;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public ResponseData(String tid, Object data, int enqueryCode, int statusCode,String statusMsg,String txntime) {
		super();
		this.tid = tid;
		this.data = data;

		//this.enqueryCode = enqueryCode;
		this.statusCode = statusCode;
		this.statusMsg=statusMsg;
		this.txnTime=txntime;
	}
	public ResponseData(String tid, Object data, int statusCode,String statusMsg,String txntime) {
		super();
		this.tid = tid;
		this.data = data;
		this.statusCode = statusCode;
		this.statusMsg=statusMsg;
		this.txnTime=txntime;
	}
	public ResponseData(int statusCode,String statusMsg,String txntime) {
		this.statusCode = statusCode;
		this.statusMsg=statusMsg;
		this.txnTime=txntime;
	}
	

public ResponseData(Object data, int statusCode,String statusMsg,String txntime) {
		super();
		this.data = data;
		this.statusCode = statusCode;
		this.statusMsg=statusMsg;
		this.txnTime=txntime;
	}
	public ResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/*@Override
	public String toString() {
		return "ResponseData [tid=" + tid + ", statusCode=" + statusCode + ",data="+data+"]";
	}*/


	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}


	/**
	 * @param tid
	 *            the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}


	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public String getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}
	
	public String toStringAllData() {
		return "ResponseData [tid=" + tid + ", data=" + data + ", statusCode=" + statusCode + ", txnTime=" + txnTime
				+ ", statusMsg=" + statusMsg + "]";
	}

	
}
