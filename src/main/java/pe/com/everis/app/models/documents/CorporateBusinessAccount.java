package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CorporateBusinessAccount")
public class CorporateBusinessAccount {

	@Id
	private String idCorporateBusinessAccount;
	
	private String numberCorporateBusinessAccount;
	private String accountType;
	private String customerType;
	private String customerDoc;
	private AccountHolders accountHolders;
	private AccountSignatories accountSignatories;
	
	private Date createAt;
	
	public CorporateBusinessAccount() {
		
	}

	public CorporateBusinessAccount(String numberCorporateBusinessAccount, String accountType, String customerType,
			String customerDoc, AccountHolders accountHolders, AccountSignatories accountSignatories) {
		super();
		this.numberCorporateBusinessAccount = numberCorporateBusinessAccount;
		this.accountType = accountType;
		this.customerType = customerType;
		this.customerDoc = customerDoc;
		this.accountHolders = accountHolders;
		this.accountSignatories = accountSignatories;
	}


	public String getIdCorporateBusinessAccount() {
		return idCorporateBusinessAccount;
	}

	public void setIdCorporateBusinessAccount(String idCorporateBusinessAccount) {
		this.idCorporateBusinessAccount = idCorporateBusinessAccount;
	}

	public String getNumberCorporateBusinessAccount() {
		return numberCorporateBusinessAccount;
	}

	public void setNumberCorporateBusinessAccount(String numberCorporateBusinessAccount) {
		this.numberCorporateBusinessAccount = numberCorporateBusinessAccount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerDoc() {
		return customerDoc;
	}

	public void setCustomerDoc(String customerDoc) {
		this.customerDoc = customerDoc;
	}

	public AccountHolders getAccountHolders() {
		return accountHolders;
	}

	public void setAccountHolders(AccountHolders accountHolders) {
		this.accountHolders = accountHolders;
	}

	public AccountSignatories getAccountSignatories() {
		return accountSignatories;
	}

	public void setAccountSignatories(AccountSignatories accountSignatories) {
		this.accountSignatories = accountSignatories;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
