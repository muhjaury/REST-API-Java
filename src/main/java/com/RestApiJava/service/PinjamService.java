package com.RestApiJava.service;

import com.RestApiJava.entity.Pinjam;
import com.RestApiJava.entity.dto.PinjamDTO;
import com.RestApiJava.entity.dto.custom.PinjamCustomDTO;
import com.RestApiJava.entity.dto.custom.PinjamCustomDTOWithId;
import com.RestApiJava.entity.mapping.PinjamMapping;
import com.RestApiJava.repository.PinjamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinjamService {
    @Autowired
    PinjamRepository pinjamRepository;

    //Create
    public PinjamCustomDTO createPinjam(PinjamDTO dto){
        Pinjam pinjam = pinjamRepository.save(PinjamMapping.INSTANCE.toEntity(dto));
        return PinjamMapping.INSTANCE.toCustomDTO(pinjam);

    }

    //Read
    public List<PinjamCustomDTO> selectAllPinjam(){
        return PinjamMapping.INSTANCE.toPinjamCustomDTOList(pinjamRepository.findAll());
    }

    public List<PinjamCustomDTOWithId> findByIdPinjam(Integer id){
        return PinjamMapping.INSTANCE.toPinjamCustomDTOWithIdList(pinjamRepository.findByIdPinjam(id));
    }

    //Update
    public PinjamCustomDTO updatePinjamById(PinjamDTO data, int id){
        Pinjam reference = pinjamRepository.findById(id).get();
        reference.setAnggota(data.getAnggota()!=null?data.getAnggota():reference.getAnggota());
        reference.setBuku(data.getBuku()!=null?data.getBuku():reference.getBuku());
        reference.setTglPinjam(data.getTglPinjam()!=null?data.getTglPinjam():reference.getTglPinjam());
        reference.setTglKembali(data.getTglKembali()!=null?data.getTglKembali():reference.getTglKembali());
        return PinjamMapping.INSTANCE.toCustomDTO(pinjamRepository.save(reference));
    }

    //Delete
    public Boolean deletePinjamById(int id){
        Pinjam reference = pinjamRepository.findById(id).orElse(null);
        if(reference != null){
            pinjamRepository.delete(reference);
            return true;
        }else{
            return false;
        }
    }

    public Integer countByIdContaining(Integer integer){
        if(integer != null){
            return pinjamRepository.countByIdPinjam(integer);
        }
        return (int) pinjamRepository.count();
    }

}
