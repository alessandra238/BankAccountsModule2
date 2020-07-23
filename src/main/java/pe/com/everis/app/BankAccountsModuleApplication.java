package pe.com.everis.app;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import pe.com.everis.app.models.dao.SavingsAccountDao;
import pe.com.everis.app.models.documents.SavingsAccount;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class BankAccountsModuleApplication implements CommandLineRunner{

	@Autowired
	private SavingsAccountDao savingsAccountDao;
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(BankAccountsModuleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BankAccountsModuleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//mongoTemplate.dropCollection("SavingsAccount").subscribe();
		
		/*Flux.just(
				new SavingsAccount("0000001", "CA", "CLIPER", "76593490", "TITULARES", "FIRMANTES"),
				new SavingsAccount("0000002", "CC", "CLIPERVIP", "76593491", "TITULARES2", "FIRMANTES2"),
				new SavingsAccount("0000003", "CPF", "CLIPYME", "76593492", "TITULARES3", "FIRMANTES3")
				)
		.flatMap(savingsAccount -> {
			savingsAccount.setCreateAt(new Date());
			return savingsAccountDao.save(savingsAccount);
			})
		.subscribe(savingsAccount -> log.info("nro de cta: "+savingsAccount.getNumberSavingsAccount()+" Tipo de cta: "+savingsAccount.getAccountType()));
	**/	
	}

}
