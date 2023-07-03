package shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSanPham")
    private Long maSanPham;

    @Column(name = "TenSanPham")
    private String tenSanPham;

    @Column(name = "ChatLieu")
    private String chatLieu;

    @Column(name = "GiaHienHanh")
    private BigDecimal giaHienHanh;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "LoaiSanPham")
    private String loaiSanPham;

    @Column(name = "MauSac")
    private String mauSac;

    @Column(name = "NhaSanXuat")
    private String nhaSanXuat;

    @Column(name = "TrangThai")
    private Integer trangThai;

}
