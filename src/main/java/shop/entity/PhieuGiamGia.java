package shop.entity;


import shop.request.PhieuGiamGiaVM;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "PhieuGiamGia")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    private String maPhieu;

    @Column(name = "TenPhieu")
    private String tenPhieu;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayBatDau")
    private Date ngayBatDau;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;

    @Column(name = "GiaTriGiam")
    private Double giaTriGiam;

    @Column(name = "GiaTriGiamToiDa")
    private Double giaTriGiamToiDa;

    @Column(name = "HinhThucGiam")
    private Boolean hinhThucGiam;

    @Column(name = "TrangThai")
    private Integer trangThai;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NguoiSoHuu")
    private KhachHang khachHang;

    public void loadFromViewModel(PhieuGiamGiaVM domain) {
        this.setTenPhieu(domain.getTenPhieu());
        this.setNgayBatDau(domain.getNgayBatDau());
        this.setNgayKetThuc(domain.getNgayKetThuc());
        this.setGiaTriGiam(domain.getGiaTriGiam());
        this.setGiaTriGiamToiDa(domain.getGiaTriGiamToiDa());
//        this.setHinhThucGiam(domain.getHinhThucGiam());
        this.setTrangThai(domain.getTrangThai());
        this.setKhachHang(domain.getKhachHang());
    }

}
