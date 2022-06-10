package com.RestApiJava.entity.mapping;

import com.RestApiJava.entity.Pinjam;
import com.RestApiJava.entity.dto.PinjamDTO;
import com.RestApiJava.entity.dto.custom.PinjamCustomDTO;
import com.RestApiJava.entity.dto.custom.PinjamCustomDTOWithId;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PinjamMapping {
    PinjamMapping INSTANCE = Mappers.getMapper(PinjamMapping.class);
    Pinjam toEntity(PinjamDTO dto);
    PinjamDTO toDTO(Pinjam pinjam);

    PinjamCustomDTO toCustomDTO(Pinjam pinjam);

    List<Pinjam> toPinjamList(List<PinjamDTO> data);
    List<PinjamDTO> toPinjamDTOList(List<Pinjam> data);

    List<PinjamCustomDTO> toPinjamCustomDTOList(List<Pinjam> data);

    List<PinjamCustomDTOWithId> toPinjamCustomDTOWithIdList(List<Pinjam> data);
}
