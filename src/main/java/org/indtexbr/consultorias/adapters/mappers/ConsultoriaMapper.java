package org.indtexbr.consultorias.adapters.mappers;

import org.indtexbr.consultorias.adapters.dto.ConsultoriaDTO;
import org.indtexbr.consultorias.application.entities.ConsultoriaEntity;

public class ConsultoriaMapper {

	public static ConsultoriaEntity consultoriaDTOToConsultoriaEntity(ConsultoriaDTO consultoriaDTO) {
		
		ConsultoriaEntity consultoriaEntity = new ConsultoriaEntity();
		consultoriaEntity.setIdConsultoria(consultoriaDTO.getIdConsultoria());
		consultoriaEntity.setNomeConsultoria(consultoriaDTO.getNomeConsultoria());
		consultoriaEntity.setCnpjConsultoria(consultoriaDTO.getCnpjConsultoria());
		consultoriaEntity.setDataContratacao(consultoriaDTO.getDataContratacao());
		consultoriaEntity.setFlagAtiva(consultoriaDTO.getFlagAtiva());
		return consultoriaEntity;
	}
	
	public static ConsultoriaDTO consultoriaEntityToConsultoriaDTO(ConsultoriaEntity consultoriaEntity) {
		
		ConsultoriaDTO consultoriaDTO = new ConsultoriaDTO();
		consultoriaDTO.setIdConsultoria(consultoriaEntity.getIdConsultoria());
		consultoriaDTO.setNomeConsultoria(consultoriaEntity.getNomeConsultoria());
		consultoriaDTO.setCnpjConsultoria(consultoriaEntity.getCnpjConsultoria());
		consultoriaDTO.setDataContratacao(consultoriaEntity.getDataContratacao());
		consultoriaDTO.setFlagAtiva(consultoriaEntity.getFlagAtiva());
		return consultoriaDTO;
	}
}
