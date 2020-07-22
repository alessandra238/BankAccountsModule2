package pe.com.everis.app.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AccountMovements")
public class AccountMovements {

	@Id
	private String idAccountMovement;
	
	private String movementType;
	private Date movementDate;
	private Double movementMount;
	private int movementNumber;
	private Double movementComission;
	private String accountType;
	private String numberAccount;
	
	public AccountMovements() {
		
	}

	public AccountMovements(String movementType, Double movementMount, int movementNumber, Double movementComission,
			String accountType, String numberAccount) {
		super();
		this.movementType = movementType;
		this.movementMount = movementMount;
		this.movementNumber = movementNumber;
		this.movementComission = movementComission;
		this.accountType = accountType;
		this.numberAccount = numberAccount;
	}



	public String getIdAccountMovement() {
		return idAccountMovement;
	}

	public void setIdAccountMovement(String idAccountMovement) {
		this.idAccountMovement = idAccountMovement;
	}

	public String getMovementType() {
		return movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public Date getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(Date movementDate) {
		this.movementDate = movementDate;
	}

	public Double getMovementMount() {
		return movementMount;
	}

	public void setMovementMount(Double movementMount) {
		this.movementMount = movementMount;
	}

	public int getMovementNumber() {
		return movementNumber;
	}

	public void setMovementNumber(int movementNumber) {
		this.movementNumber = movementNumber;
	}

	public Double getMovementComission() {
		return movementComission;
	}

	public void setMovementComission(Double movementComission) {
		this.movementComission = movementComission;
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
	
	
	
	
}
