package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {

	@GetMapping("/home")	
	public String home() {
			return "Bem vindo a Página Home";
		}
	public List<String> clientes (){
			List<String> cli = new ArrayList<String>();
			cli.add("Microsoft");
			cli.add("Google");
			cli.add("Xiaomi");
			cli.add("Sansung");
			cli.add("Apple");
			return cli;
	}
	
	@GetMapping("/contato")
	public String contato() {
		return "contato@spring-docker.com.br";
	}
}
