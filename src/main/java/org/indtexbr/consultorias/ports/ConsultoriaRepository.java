package org.indtexbr.consultorias.ports;

import java.util.UUID;

import org.indtexbr.consultorias.application.entities.ConsultoriaEntity;
import org.springframework.data.repository.CrudRepository;

public interface ConsultoriaRepository extends CrudRepository<ConsultoriaEntity, UUID>{

}
