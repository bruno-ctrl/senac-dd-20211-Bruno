package model.vo;

import java.time.LocalDate;

public class VacinaVO {

	int idVacina;	
	String nomeVacina;
	String pais;
	int estagio;
	LocalDate dataInicio;
	String nomePesquisador;
		
public VacinaVO(int idVacina,String nomeVacina ,String pais, int estagio, LocalDate dataInicio, String nomePesquisador) {
	super();
	this.idVacina = idVacina;
	this.nomeVacina = nomeVacina;
	this.pais = pais;
	this.estagio = estagio;
	this.dataInicio = dataInicio;
	this.nomePesquisador = nomePesquisador;
	
	
}

		
public VacinaVO() {
	super();
}


public int getIdVacina() {
	return idVacina;
}


public void setIdVacina(int idVacina) {
	this.idVacina = idVacina;
}


public String getNomeVacina() {
	return nomeVacina;
}


public void setNomeVacina(String nomeVacina) {
	this.nomeVacina = nomeVacina;
}


public String getPais() {
	return pais;
}

public void setPais(String pais) {
	this.pais = pais;
}

public int getEstagio() {
	return estagio;
}
public void setEstagio(int estagio) {
	this.estagio = estagio;
}

public LocalDate getDataInicio() {
	return dataInicio;
}

public void setDataInicio(LocalDate dataInicio) {
	this.dataInicio = dataInicio;
}

public String getNomePesquisador() {
	return nomePesquisador;
}

public void setNomePesquisador(String nomePesquisador) {
	this.nomePesquisador = nomePesquisador;
}


public void imprimir() {
	System.out.printf("%1d  %17s  %10s   %9d    %13s   %1s\n",
			this.getIdVacina(),
			this.getNomeVacina(),
			this.getPais(),
			this.getEstagio(),
			this.getDataInicio(),
			this.getNomePesquisador());
	
}
		
}



