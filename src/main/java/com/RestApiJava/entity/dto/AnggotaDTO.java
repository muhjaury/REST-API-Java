package com.RestApiJava.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AnggotaDTO {
    private String nama;
    private String alamat;
    private String noTelp;
    private Date tglLahir;
    private String jenisKelamin;
}
