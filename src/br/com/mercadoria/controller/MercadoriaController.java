package br.com.mercadoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mercadoria.dao.MercadoriaDAO;
import br.com.mercadoria.modelo.Mercadoria;

@Controller
public class MercadoriaController {

	@RequestMapping("mercadoria-incluir")
	public String viem_mercadoria_incluir() {

		return "mercadoria/mercadoria-incluir";
	}

	@RequestMapping("mercadoria")
	public String viem_mercadoria() {

		return "mercadoria/mercadoria";
	}

	@RequestMapping("home")
	public String viem_home() {

		return "home";
	}

	@RequestMapping("adicionaMercadoria")
	public String form(Mercadoria mercadoria) {
		MercadoriaDAO dao = new MercadoriaDAO();
		dao.inserir(mercadoria);
		return "mercadoria/mercadoria";
	}
}
