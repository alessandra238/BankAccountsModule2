package pe.com.everis.app.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AccountHolders")
public class AccountHolders {

	@Id
	private String idHolder;
	
	private String accountType;
	private String numberAccount;
	private String holdersName;
	private String holdersLastName;
	private String holdersDoc;
	private String holdersPhone;
	private String holdersMail;
	private String holdersAddress;
	
	public AccountHolders() {
		
	}

	public AccountHolders(String accountType, String numberAccount, String holdersName, String holdersLastName,
			String holdersDoc, String holdersPhone, String holdersMail, String holdersAddress) {
		
		this.accountType = accountType;
		this.numberAccount = numberAccount;
		this.holdersName = holdersName;
		this.holdersLastName = holdersLastName;
		this.holdersDoc = holdersDoc;
		this.holdersPhone = holdersPhone;
		this.holdersMail = holdersMail;
		this.holdersAddress = holdersAddress;
	}

	public String getIdHolder() {
		return idHolder;
	}

	public void setIdHolder(String idHolder) {
		this.idHolder = idHolder;
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

	public String getHoldersName() {
		return holdersName;
	}

	public void setHoldersName(String holdersName) {
		this.holdersName = holdersName;
	}

	public String getHoldersLastName() {
		return holdersLastName;
	}

	public void setHoldersLastName(String holdersLastName) {
		this.holdersLastName = holdersLastName;
	}

	public String getHoldersDoc() {
		return holdersDoc;
	}

	public void setHoldersDoc(String holdersDoc) {
		this.holdersDoc = holdersDoc;
	}

	public String getHoldersPhone() {
		return holdersPhone;
	}

	public void setHoldersPhone(String holdersPhone) {
		this.holdersPhone = holdersPhone;
	}

	public String getHoldersMail() {
		return holdersMail;
	}

	public void setHoldersMail(String holdersMail) {
		this.holdersMail = holdersMail;
	}

	public String getHoldersAddress() {
		return holdersAddress;
	}

	public void setHoldersAddress(String holdersAddress) {
		this.holdersAddress = holdersAddress;
	}
	
	
	
}
