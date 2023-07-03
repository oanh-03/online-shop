package shop.request;

import shop.entity.DiaChi;
import shop.entity.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DiaChiVM {
    @NotBlank(message = "Khong duoc de trong")
    private String tenDiaChi;

    @NotBlank(message = "Khong duoc de trong")
    private String moTaChiTiet;

    @NotBlank(message = "Khong duoc de trong")
    private String tinhThanhPho;

    @NotBlank(message = "Khong duoc de trong")
    private String quanHuyen;

    @NotBlank(message = "Khong duoc de trong")
    private String phuongXa;

    @NotBlank(message = "Khong duoc de trong")
    private String duongPho;
    private KhachHang khachHang;


    public void loadDomain(DiaChi diaChiVM) {
        this.setTenDiaChi(diaChiVM.getTenDiaChi());
        this.setMoTaChiTiet(diaChiVM.getMoTaChiTiet());
        this.setTinhThanhPho(diaChiVM.getTinhThanhPho());
        this.setQuanHuyen(diaChiVM.getQuanHuyen());
        this.setPhuongXa(diaChiVM.getPhuongXa());
        this.setDuongPho(diaChiVM.getDuongPho());
        this.setKhachHang(diaChiVM.getKhachHang());
    }
}