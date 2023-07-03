package shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
import java.util.UUID;

@Entity
@Table(name = "PhieuGiaoHang")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PhieuGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "MaPhieuGiao")
    private UUID maPhieuGiao;

    @Column(name = "NguoiNhan")
    private String nguoiNhan;

    @Column(name = "SdtNhan")
    private String sdtNhan;

    @Column(name = "NguoiGiao")
    private String nguoiGiao;

    @Column(name = "SdtGiao")
    private String sdtGiao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayGiao")
    private Date ngayGiao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayNhan")
    private Date ngayNhan;

    @Column(name = "NguoiTao")
    private String nguoiTao;

    @Column(name = "PhiGiaoHang")
    private BigDecimal phiGiaoHang;

    @ManyToOne
    @JoinColumn(name = "HoaDonGiao")
    private HoaDon hoaDonGiao;

    @ManyToOne
    @JoinColumn(name = "DiaChiGiao")
    private DiaChi diaChiGiao;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
