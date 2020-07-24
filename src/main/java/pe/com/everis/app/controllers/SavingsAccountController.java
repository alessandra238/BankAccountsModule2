package pe.com.everis.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.everis.app.models.dao.SavingsAccountDao;
import pe.com.everis.app.models.documents.SavingsAccount;
import pe.com.everis.app.services.SavingsAccountService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/SavingsAccount")
public class SavingsAccountController {

	@Autowired
	private SavingsAccountService savingsAccountService;
	
	@GetMapping("/toList")
	public Mono<ResponseEntity<Flux<SavingsAccount>>> findAll(){
		return Mono.just(
				ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(savingsAccountService.findAllSavingsAccount())
				);
	}
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<SavingsAccount>> findById(@PathVariable String id){
		return savingsAccountService.findByIdSavingsAccount(id).map( t->
				ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(t)
				).defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	
}
