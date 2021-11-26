package org.indtexbr.consultorias.application.entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConsultoriaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID idConsultoria;
	private String nomeConsultoria;
	private String cnpjConsultoria;
	private LocalDate dataContratacao;
	private String flagAtiva;
	
	public UUID getIdConsultoria() {
		return idConsultoria;
	}
	public void setIdConsultoria(UUID idConsultoria) {
		this.idConsultoria = idConsultoria;
	}
	public String getNomeConsultoria() {
		return nomeConsultoria;
	}
	public void setNomeConsultoria(String nomeConsultoria) {
		this.nomeConsultoria = nomeConsultoria;
	}
	public String getCnpjConsultoria() {
		return cnpjConsultoria;
	}
	public void setCnpjConsultoria(String cnpjConsultoria) {
		this.cnpjConsultoria = cnpjConsultoria;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public String getFlagAtiva() {
		return flagAtiva;
	}
	public void setFlagAtiva(String flagAtiva) {
		this.flagAtiva = flagAtiva;
	}
	
}
