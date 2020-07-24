package pe.com.everis.app.services;

import pe.com.everis.app.models.documents.SavingsAccount;
import reactor.core.publisher.Flux;

public interface SavingsAccountService {

	Flux<SavingsAccount> findAllSavingsAccount();
	
}
