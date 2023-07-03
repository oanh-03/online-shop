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
    //    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Column(name = "SinhNhat")
//    private Date sinhNhat;
//
//    @Column(name = "Email", unique = true)
//    private String email;
//
//
//    @Column(name = "ChungMinhThu", unique = true)
//    private String chungMinhThu;
//
//    @Column(name = "SoCanCuoc", unique = true)
//    private String soCanCuoc;
//
//    @Column(name = "AnhDaiDien")
//    private String anhDaiDien;
//
//    @Column(name = "TrangThai")
//    private Integer trangThai;
//
//    @Column(name = "DiemTichLuy", columnDefinition = "INT DEFAULT 0")
//    private Integer diemTichLuy;


}
