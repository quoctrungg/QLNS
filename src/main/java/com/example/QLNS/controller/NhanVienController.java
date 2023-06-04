package com.example.QLNS.controller;

import com.example.QLNS.entity.NhanVien;
import com.example.QLNS.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nhanvien")
@Controller
public class NhanVienController {
    @Autowired
    private NhanVienRepository nhanVienRepository;


    @ResponseBody
    @GetMapping

    public List<NhanVien> index() {
        return nhanVienRepository.findAll();
    }
}

