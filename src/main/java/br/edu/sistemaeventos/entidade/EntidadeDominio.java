package br.edu.sistemaeventos.entidade;

import java.util.Calendar;

public class EntidadeDominio {
	
	public Integer id;
	public Calendar dataCriado;
	public Calendar dataModificado;
	
	// Construtores
	public EntidadeDominio() {
		super();
	}
	
	public EntidadeDominio(Integer id, Calendar dataCriado, Calendar dataModificado) {
		super();
		this.id = id;
		this.dataCriado = dataCriado;
		this.dataModificado = dataModificado;
	}

	// Getters
	public Integer getId() {
		return id;
	}

	public Calendar getDataCriado() {
		return dataCriado;
	}

	public Calendar getDataModificado() {
		return dataModificado;
	}

	// Setters
	public void setId(Integer id) {
		this.id = id;
	}

	public void setDataCriado(Calendar dataCriado) {
		this.dataCriado = dataCriado;
	}

	public void setDataModificado(Calendar dataModificado) {
		this.dataModificado = dataModificado;
	}
	
	
}
