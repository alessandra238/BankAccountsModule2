package pe.com.everis.app.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AccountSignatories")
public class AccountSignatories {

	@Id
	private String idSignatory;
	
	private String accountType;
	private String numberAccount;
	private String signatoryName;
	private String signatoryDoc;
	private String signatoryPhone;
	private String signatoryMail;
	private String signatoryAddress;
	
	public AccountSignatories() {
		
	}

	public AccountSignatories(String accountType, String numberAccount, String signatoryName, String signatoryDoc,
			String signatoryPhone, String signatoryMail, String signatoryAddress) {
		super();
		this.accountType = accountType;
		this.numberAccount = numberAccount;
		this.signatoryName = signatoryName;
		this.signatoryDoc = signatoryDoc;
		this.signatoryPhone = signatoryPhone;
		this.signatoryMail = signatoryMail;
		this.signatoryAddress = signatoryAddress;
	}

	public String getIdSignatory() {
		return idSignatory;
	}

	public void setIdSignatory(String idSignatory) {
		this.idSignatory = idSignatory;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getSignatoryName() {
		return signatoryName;
	}

	public void setSignatoryName(String signatoryName) {
		this.signatoryName = signatoryName;
	}

	public String getSignatoryDoc() {
		return signatoryDoc;
	}

	public void setSignatoryDoc(String signatoryDoc) {
		this.signatoryDoc = signatoryDoc;
	}

	public String getSignatoryPhone() {
		return signatoryPhone;
	}

	public void setSignatoryPhone(String signatoryPhone) {
		this.signatoryPhone = signatoryPhone;
	}

	public String getSignatoryMail() {
		return signatoryMail;
	}

	public void setSignatoryMail(String signatoryMail) {
		this.signatoryMail = signatoryMail;
	}

	public String getSignatoryAddress() {
		return signatoryAddress;
	}

	public void setSignatoryAddress(String signatoryAddress) {
		this.signatoryAddress = signatoryAddress;
	}	
	
}
