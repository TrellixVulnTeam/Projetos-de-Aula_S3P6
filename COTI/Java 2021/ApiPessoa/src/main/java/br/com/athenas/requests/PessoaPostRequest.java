package br.com.athenas.requests;

import java.util.Calendar;

import br.com.athenas.enuns.Sexo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PessoaPostRequest {

	private String nome;
	private Calendar dataNasc;
	private String cpf;
	private Sexo sexo;
	private Double Altura;
	private Double Peso;
}
