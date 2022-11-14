/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.anggota.service;

import com.fadhel.anggota.entity.Anggota;
import com.fadhel.anggota.repository.RepositoryAnggota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class AnggotaService {
    @Autowired
    private RepositoryAnggota repositoryAnggota;
    
    public Anggota saveAnggota(Anggota anggota){
        return repositoryAnggota.save(anggota);
    }
    public Anggota findAnggotaById(Long anggotaId){
        return repositoryAnggota.findByAnggotaId(anggotaId);
    }
    
}
