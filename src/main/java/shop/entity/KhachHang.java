package shop.entity;


import shop.request.KhachHangVM;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

import java.sql.Date;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhachHang")
    private Long maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;


    @Column(name = "SoDienThoai")
    private String sdt;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "HangKhachHang")
    private HangKhachHang hangKhachHang;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NguoiGioiThieu")
    private KhachHang khachHang;

    public void loadView(KhachHangVM vm) {
        this.setTenKhachHang(vm.getTenKhachHang());
        this.setSdt(vm.getSdt());
        this.setGioiTinh(vm.getGioiTinh());
        this.setHangKhachHang(vm.getHangKhachHang());

    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
