package com.example.QLNS.controller;

import com.example.QLNS.entity.PhongBan;
import com.example.QLNS.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phongban")
@Controller
public class PhongBanController {
    @Autowired
    private PhongBanRepository phongBanRepository;


    @ResponseBody
    @GetMapping

    public List<PhongBan> index() {
        return phongBanRepository.findAll();
    }
}