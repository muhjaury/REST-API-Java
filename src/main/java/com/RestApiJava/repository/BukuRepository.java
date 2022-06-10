package com.RestApiJava.repository;

import com.RestApiJava.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BukuRepository extends JpaRepository<Buku, Integer> {
    List<Buku> findByJudulContainingAndPenulisContaining(String judul, String penulis);
    Integer countByJudulContaining(String judul);
    Integer countByJudulContainingAndPenulisContaining(String judul, String penulis);
}
