package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VipPersonalCurrentAccount")
public class VipPersonalCurrentAccount {

	@Id
	private String idVipPersonalCurrentAccount;
	
	private String numberVipPersonalCurrentAccount;
	private String accountType;
	private String customerType;
	private String customerDoc;
	private AccountHolders accountHolders;
	private AccountSignatories accountSignatories;
	
	private Date createAt;
	
	public VipPersonalCurrentAccount() {
		
	}
	
	public VipPersonalCurrentAccount(String numberVipPersonalCurrentAccount, String accountType, String customerType,
			String customerDoc, AccountHolders accountHolders, AccountSignatories accountSignatories) {
		super();
		this.numberVipPersonalCurrentAccount = numberVipPersonalCurrentAccount;
		this.accountType = accountType;
		this.customerType = customerType;
		this.customerDoc = customerDoc;
		this.accountHolders = accountHolders;
		this.accountSignatories = accountSignatories;
	}



	public String getIdVipPersonalCurrentAccount() {
		return idVipPersonalCurrentAccount;
	}

	public void setIdVipPersonalCurrentAccount(String idVipPersonalCurrentAccount) {
		this.idVipPersonalCurrentAccount = idVipPersonalCurrentAccount;
	}

	public String getNumberVipPersonalCurrentAccount() {
		return numberVipPersonalCurrentAccount;
	}

	public void setNumberVipPersonalCurrentAccount(String numberVipPersonalCurrentAccount) {
		this.numberVipPersonalCurrentAccount = numberVipPersonalCurrentAccount;
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
