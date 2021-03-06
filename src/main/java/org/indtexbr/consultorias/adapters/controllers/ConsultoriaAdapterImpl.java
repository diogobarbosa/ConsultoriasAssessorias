package org.indtexbr.consultorias.adapters.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.adapters.dto.ConsultoriaDTO;
import org.indtexbr.consultorias.adapters.mappers.ConsultoriaMapper;
import org.indtexbr.consultorias.ports.ConsultoriaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultoriaAdapterImpl implements ConsultoriaAdapter{

	@Autowired
	private ConsultoriaPort consultoriaUseCase;
	
	@GetMapping("/consultorias")
	public ResponseEntity<List<ConsultoriaDTO>> consultarConsultorias() {

		List<ConsultoriaDTO> listaConsultoriaDTO = new ArrayList<ConsultoriaDTO>();
		consultoriaUseCase.consultarConsultorias().forEach( consultoriaEntity -> {
						ConsultoriaDTO consultoriaDTO = ConsultoriaMapper.consultoriaEntityToConsultoriaDTO(consultoriaEntity);
						listaConsultoriaDTO.add(consultoriaDTO);
					});
		
		return ResponseEntity.ok(listaConsultoriaDTO);
	}
	
	@GetMapping("/consultorias/{idConsultoria}")
	public ResponseEntity<ConsultoriaDTO> consultarConsultoria(@PathVariable UUID idConsultoria) {

		return ResponseEntity.ok(ConsultoriaMapper.consultoriaEntityToConsultoriaDTO(consultoriaUseCase.consultarConsultoria(idConsultoria)));
	}

	@PostMapping("/consultorias")
	public ResponseEntity<Void> inserirConsultoria(@RequestBody ConsultoriaDTO consultoria) {
		
		consultoriaUseCase.inserirConsultoria(ConsultoriaMapper.consultoriaDTOToConsultoriaEntity(consultoria));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/consultorias/{idConsultoria}")
	public ResponseEntity<Void> alterarConsultoria(@PathVariable UUID idConsultoria, @RequestBody ConsultoriaDTO consultoria) {
		
		consultoria.setIdConsultoria(idConsultoria);
		consultoriaUseCase.alterarConsultoria(ConsultoriaMapper.consultoriaDTOToConsultoriaEntity(consultoria));
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/consultorias/{idConsultoria}")
	public ResponseEntity<Void> deletarConsultoria(@PathVariable UUID idConsultoria) {

		consultoriaUseCase.deletarConsultoria(idConsultoria);
		return  ResponseEntity.noContent().build();
	}
	
}
