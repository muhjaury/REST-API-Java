package com.RestApiJava.entity.dto.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PinjamCustomDTOWithId {
    private Integer idPinjam;
    private AnggotaCustomDTO anggota;
    private BukuCustomDTO buku;
    private Date tglPinjam;
    private Date tglKembali;
}
