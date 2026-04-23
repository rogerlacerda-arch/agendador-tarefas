package com.rogerLacerda.agendador_tarefas.business.mapper;

import com.rogerLacerda.agendador_tarefas.business.dto.TarefasDTO;
import com.rogerLacerda.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    public void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
