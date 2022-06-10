package com.RestApiJava.entity.dto;

import com.RestApiJava.entity.Anggota;
import com.RestApiJava.entity.Buku;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PinjamDTO {

    private Anggota anggota;
    private Buku buku;
    private Date tglPinjam;
    private Date tglKembali;

}
