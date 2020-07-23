package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SavingsAccount")
public class SavingsAccount {
	
	@Id
	private String idSavingsAccount;
	
	private String numberSavingsAccount;
	private String accountType;
	private String customerType;
	private String customerDoc;
	private AccountHolders accountHolders;
	private AccountSignatories accountSignatories;
	
	private Date createAt;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(String numberSavingsAccount, String accountType, String customerType, String customerDoc,
			AccountHolders accountHolders, AccountSignatories accountSignatories, Date createAt) {
		
		this.numberSavingsAccount = numberSavingsAccount;
		this.accountType = accountType;
		this.customerType = customerType;
		this.customerDoc = customerDoc;
		this.accountHolders = accountHolders;
		this.accountSignatories = accountSignatories;
		this.createAt = createAt;
	}

	public String getIdSavingsAccount() {
		return idSavingsAccount;
	}

	public void setIdSavingsAccount(String idSavingsAccount) {
		this.idSavingsAccount = idSavingsAccount;
	}

	public String getNumberSavingsAccount() {
		return numberSavingsAccount;
	}

	public void setNumberSavingsAccount(String numberSavingsAccount) {
		this.numberSavingsAccount = numberSavingsAccount;
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

