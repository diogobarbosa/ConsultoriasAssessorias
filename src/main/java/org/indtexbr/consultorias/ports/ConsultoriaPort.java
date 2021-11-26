package org.indtexbr.consultorias.ports;

import java.util.List;
import java.util.UUID;

import org.indtexbr.consultorias.application.entities.ConsultoriaEntity;

public interface ConsultoriaPort {

	public void inserirConsultoria(ConsultoriaEntity consultoriaEntity);
	public List<ConsultoriaEntity> consultarConsultorias();
	public ConsultoriaEntity consultarConsultoria(UUID idConsultoria);
	public void alterarConsultoria(ConsultoriaEntity consultoriaEntity);
	public void deletarConsultoria(UUID idConsultoria);
}
