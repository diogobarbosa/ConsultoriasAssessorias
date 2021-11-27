package org.indtexbr.consultorias.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.adapters.dto.ConsultoriaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface ConsultoriaAdapter{

	public ResponseEntity<Void> inserirConsultoria(ConsultoriaDTO consultoria);
	
	public ResponseEntity<List<ConsultoriaDTO>> consultarConsultorias();

	public ResponseEntity<ConsultoriaDTO> consultarConsultoria(UUID idConsultoria);
	
	public ResponseEntity<Void> alterarConsultoria(@PathVariable UUID idConsultoria, ConsultoriaDTO consultoria);
	
	public ResponseEntity<Void> deletarConsultoria(UUID idConsultoria);
}
