package com.RestApiJava.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class BukuDTO {
    private String judul;
    private String penulis;
    private String penerbit;
    private Date tahunTerbit;
    private String jenisBuku;
}
