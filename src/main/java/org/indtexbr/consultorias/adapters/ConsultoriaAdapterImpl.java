package org.indtexbr.consultorias.adapters;

import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.entities.ConsultoriaEntity;
import org.indtexbr.consultorias.ports.ConsultoriaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class ConsultoriaAdapterImpl implements ConsultoriaAdapter{

	@Autowired
	private ConsultoriaPort normaUseCase;
	
	@GetMapping("/consultorias")
	public ResponseEntity<List<ConsultoriaEntity>> consultarConsultorias() {

		return ResponseEntity.ok(normaUseCase.consultarConsultorias());
	}
	
	@GetMapping("/consultorias/{idConsultoria}")
	public ResponseEntity<ConsultoriaEntity> consultarConsultoria(@PathVariable UUID idConsultoria) {

		return ResponseEntity.ok(normaUseCase.consultarConsultoria(idConsultoria));
	}

	@PostMapping("/consultorias")
	public ResponseEntity<Void> inserirConsultoria(@RequestBody ConsultoriaEntity consultoria) {
		
		normaUseCase.inserirConsultoria(consultoria);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/consultorias")
	public ResponseEntity<Void> alterarConsultoria(@RequestBody ConsultoriaEntity consultoria) {
		normaUseCase.alterarConsultoria(consultoria);
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/consultorias/{idConsultoria}")
	public ResponseEntity<Void> deletarConsultoria(@PathVariable UUID idConsultoria) {

		normaUseCase.deletarConsultoria(idConsultoria);
		return  ResponseEntity.noContent().build();
	}
	
}