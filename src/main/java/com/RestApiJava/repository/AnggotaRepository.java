package com.RestApiJava.repository;

import com.RestApiJava.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnggotaRepository extends JpaRepository<Anggota,Integer> {
    List<Anggota> findByNamaContaining(String nama);
    Integer countByNamaContaining(String nama);
}
