package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VipFixedTermAccount")
public class VipFixedTermAccount {

	@Id
	private String idVipFixedTermAccount;
	
	private String numberVipFixedTermAccount;
	private String accountType;
	private String customerType;
	private String customerDoc;
	private AccountHolders accountHolders;
	private AccountSignatories accountSignatories;
	private Double initialBalance;
	private Double actualBalance;
	private int numberMonths;
	private Double profit;
	
	private Date createAt;
	
	public VipFixedTermAccount() {
		
	}

	public VipFixedTermAccount(String numberVipFixedTermAccount, String accountType, String customerType,
			String customerDoc, AccountHolders accountHolders, AccountSignatories accountSignatories,
			Double initialBalance, Double actualBalance, int numberMonths, Double profit) {

		
		this.numberVipFixedTermAccount = numberVipFixedTermAccount;
		this.accountType = accountType;
		this.customerType = customerType;
		this.customerDoc = customerDoc;
		this.accountHolders = accountHolders;
		this.accountSignatories = accountSignatories;
		this.initialBalance = initialBalance;
		this.actualBalance = actualBalance;
		this.numberMonths = numberMonths;
		this.profit = profit;
	}


	public String getIdVipFixedTermAccount() {
		return idVipFixedTermAccount;
	}

	public void setIdVipFixedTermAccount(String idVipFixedTermAccount) {
		this.idVipFixedTermAccount = idVipFixedTermAccount;
	}

	public String getNumberVipFixedTermAccount() {
		return numberVipFixedTermAccount;
	}

	public void setNumberVipFixedTermAccount(String numberVipFixedTermAccount) {
		this.numberVipFixedTermAccount = numberVipFixedTermAccount;
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

	public Double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(Double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public Double getActualBalance() {
		return actualBalance;
	}

	public void setActualBalance(Double actualBalance) {
		this.actualBalance = actualBalance;
	}

	public int getNumberMonths() {
		return numberMonths;
	}

	public void setNumberMonths(int numberMonths) {
		this.numberMonths = numberMonths;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
