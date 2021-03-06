package com.RestApiJava.entity.mapping;

import com.RestApiJava.entity.Buku;
import com.RestApiJava.entity.dto.BukuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BukuMapping {
    BukuMapping INSTANCE = Mappers.getMapper(BukuMapping.class);
    Buku toEntity(BukuDTO dto);
    BukuDTO toDTO(Buku buku);

    List<Buku> toBukuList(List<BukuDTO> data);
    List<BukuDTO> toBukuDTOList(List<Buku> data);
}
