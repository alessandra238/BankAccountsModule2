package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VipPersonalSavingAccount")
public class VipPersonalSavingsAccount {

	@Id
	private String idVipPersonalSavingsAccount;
	
	private String numberVipPersonalSavingsAccount;
	private String accountType;
	private String customerType;
	private String customerDoc;
	private AccountHolders accountHolders;
	private AccountSignatories accountSignatories;
	
	private Date createAt;

	public VipPersonalSavingsAccount() {
		
	}
	
	public VipPersonalSavingsAccount(String numberVipPersonalSavingsAccount, String accountType, String customerType,
			String customerDoc, AccountHolders accountHolders, AccountSignatories accountSignatories) {

		this.numberVipPersonalSavingsAccount = numberVipPersonalSavingsAccount;
		this.accountType = accountType;
		this.customerType = customerType;
		this.customerDoc = customerDoc;
		this.accountHolders = accountHolders;
		this.accountSignatories = accountSignatories;
	}

	public String getIdVipPersonalSavingsAccount() {
		return idVipPersonalSavingsAccount;
	}

	public void setIdVipPersonalSavingsAccount(String idVipPersonalSavingsAccount) {
		this.idVipPersonalSavingsAccount = idVipPersonalSavingsAccount;
	}

	public String getNumberVipPersonalSavingsAccount() {
		return numberVipPersonalSavingsAccount;
	}

	public void setNumberVipPersonalSavingsAccount(String numberVipPersonalSavingsAccount) {
		this.numberVipPersonalSavingsAccount = numberVipPersonalSavingsAccount;
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
