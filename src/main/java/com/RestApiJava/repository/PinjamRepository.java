package com.RestApiJava.repository;

import com.RestApiJava.entity.Pinjam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PinjamRepository extends JpaRepository<Pinjam, Integer> {
    Integer countByIdPinjam(Integer integer);
    List<Pinjam> findByIdPinjam(Integer integer);
}
