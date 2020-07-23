package pe.com.everis.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.everis.app.models.dao.SavingsAccountDao;
import pe.com.everis.app.models.documents.SavingsAccount;
import reactor.core.publisher.Flux;

@Controller
public class SavingsAccountController {

	//Inyectando el DAO
	@Autowired
	private SavingsAccountDao savingsAccountDao;
	
	@GetMapping("/toList")
	public String toList(Model model) {
		Flux<SavingsAccount> savingsAccount = savingsAccountDao.findAll();
		return "toList";
	}
}
