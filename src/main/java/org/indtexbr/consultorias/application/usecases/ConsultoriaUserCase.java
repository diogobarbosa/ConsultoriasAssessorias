package org.indtexbr.consultorias.application.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.application.entities.ConsultoriaEntity;
import org.indtexbr.consultorias.ports.ConsultoriaPort;
import org.indtexbr.consultorias.ports.ConsultoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultoriaUserCase implements ConsultoriaPort{

	@Autowired
	private ConsultoriaRepository consultoriaRepository;
	
	@Override
	public void inserirConsultoria(ConsultoriaEntity consultoriaEntity) {
		
		consultoriaRepository.save(consultoriaEntity);
	}

	@Override
	public List<ConsultoriaEntity> consultarConsultorias() {
		
		List<ConsultoriaEntity> listaConsultoria = new ArrayList<>();
		consultoriaRepository.findAll().forEach(listaConsultoria::add);
		
		return listaConsultoria;
	}
	
	@Override
	public ConsultoriaEntity consultarConsultoria(UUID idConsultoria) {
	
		return consultoriaRepository.findById(idConsultoria).orElse(null);
	}

	@Override
	public void alterarConsultoria(ConsultoriaEntity consultoriaEntity) {
		
		consultoriaRepository.save(consultoriaEntity);
	}

	@Override
	public void deletarConsultoria(UUID idConsultoria) {
		
		consultoriaRepository.deleteById(idConsultoria);
	}

}
