package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FixedTermAccount")
public class FixedTermAccount {

	@Id
	private String idFixedTermAccount;
	
	private String numberFixedTermAccount;
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
	
	public FixedTermAccount() {
		
	}
	
	public FixedTermAccount(String numberFixedTermAccount, String accountType, String customerType, String customerDoc,
			AccountHolders accountHolders, AccountSignatories accountSignatories, Double initialBalance,
			Double actualBalance, int numberMonths, Double profit) {

		this.numberFixedTermAccount = numberFixedTermAccount;
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

	public String getIdFixedTermAccount() {
		return idFixedTermAccount;
	}
	public void setIdFixedTermAccount(String idFixedTermAccount) {
		this.idFixedTermAccount = idFixedTermAccount;
	}
	public String getNumberFixedTermAccount() {
		return numberFixedTermAccount;
	}
	public void setNumberFixedTermAccount(String numberFixedTermAccount) {
		this.numberFixedTermAccount = numberFixedTermAccount;
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
	
}
