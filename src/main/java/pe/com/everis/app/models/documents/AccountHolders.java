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
	
	
}
