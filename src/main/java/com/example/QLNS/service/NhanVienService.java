package com.example.QLNS.service;

import com.example.QLNS.entity.NhanVien;
import com.example.QLNS.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository repo;
    public List<NhanVien> GetAll(){ return (List<NhanVien>) repo.findAll();}

    public void add(NhanVien newNhanVien){repo.save(newNhanVien);}
}
