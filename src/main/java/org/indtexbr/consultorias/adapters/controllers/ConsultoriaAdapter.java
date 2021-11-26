package org.indtexbr.consultorias.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.adapters.dto.ConsultoriaDTO;
import org.springframework.http.ResponseEntity;

public interface ConsultoriaAdapter{

	public ResponseEntity<Void> inserirConsultoria(ConsultoriaDTO consultoria);
	
	public ResponseEntity<List<ConsultoriaDTO>> consultarConsultorias();

	public ResponseEntity<ConsultoriaDTO> consultarConsultoria(UUID idConsultoria);
	
	public ResponseEntity<Void> alterarConsultoria(ConsultoriaDTO consultoria);
	
	public ResponseEntity<Void> deletarConsultoria(UUID idConsultoria);
}
