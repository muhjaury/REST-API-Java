package com.RestApiJava.controller;

import com.RestApiJava.entity.Anggota;
import com.RestApiJava.entity.dto.AnggotaDTO;
import com.RestApiJava.response.Response;
import com.RestApiJava.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/anggota")
public class AnggotaController {

    @Autowired
    AnggotaService anggotaService;

    //Create
    @PostMapping
    public Response createAnggota(@RequestBody AnggotaDTO data){
        return new Response(anggotaService.createAnggota(data), "Data berhasil ditambahkan", HttpStatus.OK);
    }

    //Read
    @GetMapping
    public Response selectAllAnggota(){
        return new Response(anggotaService.selectAllAnggota(), "Data berhasil ditampilkan", anggotaService.countByNamaContaining(null),HttpStatus.OK);
    }

    @GetMapping(value="findNama")
    public Response findByNama(@RequestParam(value = "nama") String string){
        return new Response(anggotaService.findByNama(string), "Data berhasil ditambilkan", anggotaService.countByNamaContaining(string), HttpStatus.OK);
    }

    //Update
    @PutMapping //Update ID in Body, not in PathVariable
    public Response updateAnggotaById(@RequestBody Anggota param){
        return new Response(anggotaService.updateAnggotaById(param),"Data berhasil diubah", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public Response deleteAnggotaById(@PathVariable int id){
        if(anggotaService.deleteAnggotaById(id)) {
            return new Response(null,"Data berhasil dihapus",HttpStatus.OK);
        }else{
            return new Response(null,"Data gagal dihapus",HttpStatus.OK);
        }
    }

}
