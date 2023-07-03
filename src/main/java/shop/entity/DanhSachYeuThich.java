package shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "DanhSachYeuThich")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DanhSachYeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MaDanhSach")
    private UUID maDanhSach;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayTao")
    private Date ngayTao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayCapNhap")
    private Date ngayCapNhap;

    @OneToOne
    @JoinColumn(name = "NguoiSoHuu")
    private KhachHang nguoiSoHuu;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
