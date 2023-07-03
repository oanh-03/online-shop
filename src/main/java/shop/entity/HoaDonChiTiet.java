//package com.fpt.sd17313.entity;
//
//
//import com.fpt.sd17313.request.HoaDonChiTietVM;
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
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.UUID;
//
//@Entity
//@Table(name="HoaDonChiTiet")
//@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
//
//public class HoaDonChiTiet {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Column(name="Id")
//    private UUID id;
//
//    @Column(name="SoLuong")
//    private Integer soLuong;
//
//    @Column(name="DonGia")
//    private BigDecimal donGia;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "IdHoaDon")
//    private HoaDon hoaDon;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "IdChiTietSP")
//    private ChiTietSanPham chiTietSanPham;
//    public void loadFromViewModel(HoaDonChiTietVM vm) {
//        this.setSoLuong(vm.getSoLuong());
//        this.setDonGia(vm.getDonGia());
//        this.setHoaDon(vm.getHoaDon());
//        this.setChiTietSanPham(vm.getChiTietSanPham());
//    }
//
//}
