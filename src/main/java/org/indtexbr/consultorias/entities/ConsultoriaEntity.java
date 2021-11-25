package org.indtexbr.consultorias.entities;

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
	private UUID idNorma;
	private String descricaoNorma;
	private LocalDate dataNorma;
	
	public UUID getIdNorma() {
		return idNorma;
	}
	public void setIdNorma(UUID idNorma) {
		this.idNorma = idNorma;
	}
	public String getDescricaoNorma() {
		return descricaoNorma;
	}
	public void setDescricaoNorma(String descricaoNorma) {
		this.descricaoNorma = descricaoNorma;
	}
	public LocalDate getDataNorma() {
		return dataNorma;
	}
	public void setDataNorma(LocalDate dataNorma) {
		this.dataNorma = dataNorma;
	}
	
}
