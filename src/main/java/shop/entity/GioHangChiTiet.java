//package com.fpt.sd17313.entity;
//
//import com.fpt.sd17313.request.GioHangChiTietVM;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import java.math.BigDecimal;
//import java.util.UUID;
//
//@Entity
//@Table(name = "GioHangChiTiet")
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Getter
//@Setter
//public class GioHangChiTiet {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Column(name = "Id")
//    private UUID id;
//
//    @Column(name = "SoLuong")
//    private Integer soLuong;
//
//    @Column(name = "DonGia")
//    private BigDecimal donGia;
//
//    @Column(name = "DonGiaKhiGiam")
//    private BigDecimal donGiaKhiGiam;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "IdGioHang")
//    private GioHang gioHang;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "IdChiTietSP")
//    private ChiTietSanPham chiTietSanPham;
//
//    public void loadFromViewModel(GioHangChiTietVM vm) {
//        this.setSoLuong(vm.getSoLuong());
//        this.setDonGia(vm.getDonGia());
//        this.setDonGiaKhiGiam(vm.getDonGiaKhiGiam());
//    }
//}
