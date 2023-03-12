package testes;

import java.io.IOException;

import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends MassadeDados {

	@Given("que eu esteja no site")
	public void que_eu_esteja_no_site() {

		Executa.abrirNavegador();
		Executa.abrirtela();
		Metodos.escrever(escrever, nome);
		Metodos.submit(pesquisa);
	}

	@Given("clique em receba em casa")
	public void clique_em_receba_em_casa() {

		Metodos.clicar(receberemcasa);
	}

	@When("digito o cep")
	public void digito_o_cep() {

		Metodos.escrever(cep, Cep);

	}

	@Then("sou redirecionado para entra na conta")
	public void sou_redirecionado_para_entra_na_conta() throws IOException {

		Metodos.evidencia(Cep);
		Executa.fecharNavegador();

	}

}
