package com.example.QLNS.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNV;
    @Column
    private String tenNV;
    @Column
    private String phai;
    @Column
    private String noiSinh;
    @Column
    private String maPhong;
    @Column
    private Long luong;
}
