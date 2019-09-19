package com.npst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionContext")
public class SessionContext {

	SupervisorContext SupervisorContextObject;
	private String BankCode;
	private String Channel;
	private String ExternalBatchNumber;
	private String ExternalReferenceNo;
	private String ExternalSystemAuditTrailNumber;
	private String LocalDateTimeText;
	private String OriginalReferenceNo;
	private String OverridenWarnings;
	private String PostingDateText;
	private String ServiceCode;
	private String SessionTicket;
	private String TransactionBranch;
	private String UserId;
	private String UserReferenceNumber;
	private String ValueDateText;

	public SupervisorContext getSupervisorContext() {
		return SupervisorContextObject;
	}

	public String getBankCode() {
		return BankCode;
	}

	public String getChannel() {
		return Channel;
	}

	public String getExternalBatchNumber() {
		return ExternalBatchNumber;
	}

	public String getExternalReferenceNo() {
		return ExternalReferenceNo;
	}

	public String getExternalSystemAuditTrailNumber() {
		return ExternalSystemAuditTrailNumber;
	}

	public String getLocalDateTimeText() {
		return LocalDateTimeText;
	}

	public String getOriginalReferenceNo() {
		return OriginalReferenceNo;
	}

	public String getOverridenWarnings() {
		return OverridenWarnings;
	}

	public String getPostingDateText() {
		return PostingDateText;
	}

	public String getServiceCode() {
		return ServiceCode;
	}

	public String getSessionTicket() {
		return SessionTicket;
	}

	public String getTransactionBranch() {
		return TransactionBranch;
	}

	public String getUserId() {
		return UserId;
	}

	public String getUserReferenceNumber() {
		return UserReferenceNumber;
	}

	public String getValueDateText() {
		return ValueDateText;
	}

	public void setSupervisorContext(SupervisorContext SupervisorContextObject) {
		this.SupervisorContextObject = SupervisorContextObject;
	}

	public void setBankCode(String BankCode) {
		this.BankCode = BankCode;
	}

	public void setChannel(String Channel) {
		this.Channel = Channel;
	}

	public void setExternalBatchNumber(String ExternalBatchNumber) {
		this.ExternalBatchNumber = ExternalBatchNumber;
	}

	public void setExternalReferenceNo(String ExternalReferenceNo) {
		this.ExternalReferenceNo = ExternalReferenceNo;
	}

	public void setExternalSystemAuditTrailNumber(String ExternalSystemAuditTrailNumber) {
		this.ExternalSystemAuditTrailNumber = ExternalSystemAuditTrailNumber;
	}

	public void setLocalDateTimeText(String LocalDateTimeText) {
		this.LocalDateTimeText = LocalDateTimeText;
	}

	public void setOriginalReferenceNo(String OriginalReferenceNo) {
		this.OriginalReferenceNo = OriginalReferenceNo;
	}

	public void setOverridenWarnings(String OverridenWarnings) {
		this.OverridenWarnings = OverridenWarnings;
	}

	public void setPostingDateText(String PostingDateText) {
		this.PostingDateText = PostingDateText;
	}

	public void setServiceCode(String ServiceCode) {
		this.ServiceCode = ServiceCode;
	}

	public void setSessionTicket(String SessionTicket) {
		this.SessionTicket = SessionTicket;
	}

	public void setTransactionBranch(String TransactionBranch) {
		this.TransactionBranch = TransactionBranch;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}

	public void setUserReferenceNumber(String UserReferenceNumber) {
		this.UserReferenceNumber = UserReferenceNumber;
	}

	public void setValueDateText(String ValueDateText) {
		this.ValueDateText = ValueDateText;
	}

}
