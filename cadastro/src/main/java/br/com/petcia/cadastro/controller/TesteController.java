package br.com.petcia.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello!! Está tudo ok!";
	}
	
}
