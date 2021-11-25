package org.indtexbr.consultorias.adapters;

import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.entities.ConsultoriaEntity;
import org.springframework.http.ResponseEntity;

public interface ConsultoriaAdapter{

	public ResponseEntity<Void> inserirConsultoria(ConsultoriaEntity consultoria);
	
	public ResponseEntity<List<ConsultoriaEntity>> consultarConsultorias();

	public ResponseEntity<ConsultoriaEntity> consultarConsultoria(UUID idConsultoria);
	
	public ResponseEntity<Void> alterarConsultoria(ConsultoriaEntity consultoria);
	
	public ResponseEntity<Void> deletarConsultoria(UUID idConsultoria);
}
