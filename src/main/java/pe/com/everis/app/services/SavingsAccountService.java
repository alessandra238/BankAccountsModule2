package pe.com.everis.app.services;

import pe.com.everis.app.models.documents.SavingsAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingsAccountService {

	Flux<SavingsAccount> findAllSavingsAccount();
	
	Mono<SavingsAccount> saveSavingsAccount(SavingsAccount savingsAccount);
	
	Mono<SavingsAccount> findByIdSavingsAccount(String id);
}
