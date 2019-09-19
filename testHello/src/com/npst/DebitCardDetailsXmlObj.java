package com.npst;

import javax.xml.bind.annotation.XmlRootElement;

/*<input Operation="DebitCardDetails(SessionContext, String)" Service="CANARACustomerDetailsManagerService">
<SessionContext>
<SupervisorContext>
<PrimaryPassword />
<UserId />
</SupervisorContext>
<BankCode>15</BankCode>
<Channel />
<ExternalBatchNumber />
<ExternalReferenceNo />
<ExternalSystemAuditTrailNumber />
<LocalDateTimeText />
<OriginalReferenceNo />
<OverridenWarnings />
<PostingDateText />
<ServiceCode />
<SessionTicket />
<TransactionBranch>906</TransactionBranch>
<UserId>SYSTEM01</UserId>
<UserReferenceNumber>987</UserReferenceNumber>
<ValueDateText />
</SessionContext>
<MobileNo>{0}</MobileNo>
<CustomerID>0</CustomerID>
<AccountNumber />
</input>*/
public class DebitCardDetailsXmlObj {

	Input InputObject;

	public Input getInput() {
		return InputObject;
	}
	public void setInput(Input inputObject) {
		this.InputObject = inputObject;
	}
}
