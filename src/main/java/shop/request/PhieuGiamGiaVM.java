package shop.request;


import shop.entity.KhachHang;
import shop.entity.PhieuGiamGia;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PhieuGiamGiaVM {
    @NotBlank(message = "Khong duoc de trong")
    private String tenPhieu;

    @NotNull(message = "Khong duoc de trong")
//    @Past(message = "Ngày bắt đầu phải nhỏ hơn ngày kết thúc")
    private Date ngayBatDau;

    @NotNull(message = "Khong duoc de trong")
//    @Future(message = "Ngày kết thúc phải lớn hơn ngày bắt đầu")
    private Date ngayKetThuc;

    @NotNull(message = "Khong duoc de trong")
    private Double giaTriGiam;

//    @NotBlank(message = "Khong duoc de trong")
    private Double giaTriGiamToiDa;

//    @NotBlank(message = "Khong duoc de trong")
    private Boolean hinhThucGiam;

    @NotNull(message = "Khong duoc de trong")
    private Integer trangThai;

    private KhachHang khachHang;


    public void loadFromDomainModel(PhieuGiamGia domain) {
        this.setTenPhieu(domain.getTenPhieu());
        this.setNgayBatDau(domain.getNgayBatDau());
        this.setNgayKetThuc(domain.getNgayKetThuc());
        this.setGiaTriGiam(domain.getGiaTriGiam());
        this.setGiaTriGiamToiDa(domain.getGiaTriGiamToiDa());
        this.setTrangThai(domain.getTrangThai());
        this.setKhachHang(domain.getKhachHang());
    }
}
