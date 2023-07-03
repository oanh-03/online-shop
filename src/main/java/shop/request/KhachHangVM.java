package shop.request;


import shop.entity.HangKhachHang;
import shop.entity.KhachHang;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class KhachHangVM {
//    @NotNull(message = "Khong duoc de trong")
//    private Long maKhachHang;
    @NotBlank(message = "Khong duoc de trong")
    private String tenKhachHang;
    @NotNull(message = "Khong duoc de trong")
    private String sdt;
    @NotNull(message = "Khong duoc de trong")
    private Boolean gioiTinh;
    private HangKhachHang hangKhachHang;

    public void loadDomain(KhachHang khachHang) {
//        this.setMaKhachHang(khachHang.getMaKhachHang());
        this.setTenKhachHang(khachHang.getTenKhachHang());
        this.setSdt(khachHang.getSdt());
        this.setGioiTinh(khachHang.getGioiTinh());
        this.setHangKhachHang(khachHang.getHangKhachHang());
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    //    @NotNull(message = "Khong duoc de trong")
//    private Date sinhNhat;
    //    @NotBlank(message = "Khong duoc de trong")
//    private String email;
    //    @NotBlank(message = "Khong duoc de trong")
//    private String chungMinhThu;
//    @NotBlank(message = "Khong duoc de trong")
//    private String soCanCuoc;
//    @NotNull(message = "Khong duoc de trong")
//    private String anhDaiDien;
//    @NotNull(message = "Khong duoc de trong")
//    private Integer trangThai;
//    @NotNull(message = "Khong duoc de trong")
//    private Integer diemTichLuy;


}
