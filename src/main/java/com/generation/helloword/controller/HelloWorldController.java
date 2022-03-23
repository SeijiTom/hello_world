package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "Hello World!";

	}

	@GetMapping("/listabsm")
	public String listabsm() {
		return "Lista de BSM's da Generation Brasil:\n\n-Persistência " + "\n-Mentalidade de crescimento "
				+ "\n-Responsabilidade pessoal \n-Orientação ao futuro" + "\n-Comunicação, "
				+ "\n-Proatividade \n-Orientação ao detalhe \n-Trabalho em equipe";

	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos de aprendizagem desta semana:\n\nOs meus objetivos "
				+ "para esta semana são aprimorar minhas habilidades técnicas e "
				+ "revisar os conceitos de banco de dados, além de aprimorar "
				+ "minha responsabilidade pessoal, que será colocada a teste "
				+ "neste fim de semana pois quero usar todo tempo que tenho para" + "estudar arduamente!";

	}

}
