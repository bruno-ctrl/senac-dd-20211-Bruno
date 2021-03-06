package model.vo;

import java.time.LocalDate;

public class PessoaVO {
	
	int idPessoa;
	String nome;
	LocalDate dataNascimento;
	String sexo;
	String CPF;
	int tipoPessoa;
	
		
public PessoaVO(int idPessoa , String nome, LocalDate dataNascimento, String sexo, String CPF, int tipoPessoa) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.CPF = CPF;
		this.tipoPessoa = tipoPessoa;
		this.idPessoa = idPessoa;
	}

public int getIdPessoa() {
	return idPessoa;
}

public void setIdPessoa(int idPessoa) {
	this.idPessoa = idPessoa;
}

public int getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

public PessoaVO() {
	super();
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public LocalDate getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String CPF) {
	this.CPF = CPF;
}

		
		
}




