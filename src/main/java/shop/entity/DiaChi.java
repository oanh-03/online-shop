package shop.entity;


import shop.request.DiaChiVM;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "DiaChi ")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "MaDiaChi")
    private UUID maDiaChi;

    @Column(name = "TenDiaChi")
    private String tenDiaChi;

    @Column(name = "MoTaChiTiet")
    private String moTaChiTiet;

    @Column(name = "TinhThanhPho")
    private String tinhThanhPho;

    @Column(name = "QuanHuyen")
    private String quanHuyen;

    @Column(name = "PhuongXa")
    private String phuongXa;

    @Column(name = "DuongPho")
    private String duongPho;

    @ManyToOne
    @JoinColumn(name = "KhachHang")
    private KhachHang khachHang;

    public void loadView(DiaChiVM diaChiVM) {
        this.setTenDiaChi(diaChiVM.getTenDiaChi());
        this.setMoTaChiTiet(diaChiVM.getMoTaChiTiet());
        this.setTinhThanhPho(diaChiVM.getTinhThanhPho());
        this.setQuanHuyen(diaChiVM.getQuanHuyen());
        this.setPhuongXa(diaChiVM.getPhuongXa());
        this.setDuongPho(diaChiVM.getDuongPho());
        this.setKhachHang(diaChiVM.getKhachHang());
    }
}