 package entities;

import java.util.List;

public class Empresa {

	private Integer idEmpresa;
	private String nome;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	private List<Funcionario> funcionarios;
	
	public Empresa() {
	
	}

	public Empresa(Integer idEmpresa, String nome, String nomeFantasia, String razaoSocial, String cnpj,
			List<Funcionario> funcionarios) {
		super();
		this.idEmpresa = idEmpresa;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nome=" + nome + ", nomeFantasia=" + nomeFantasia
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", funcionarios=" + funcionarios + "]";
	}
	
	
}
