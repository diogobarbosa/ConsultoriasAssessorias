package org.indtexbr.consultorias.application.entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class ConsultoriaEntity {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Type(type="uuid-char")
	@GeneratedValue(generator = "uuid2")
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
