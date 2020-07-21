package pe.com.everis.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import pe.com.everis.app.models.documents.SavingsAccount;

public interface SavingsAccountDao extends ReactiveMongoRepository<SavingsAccount, String>{

}
