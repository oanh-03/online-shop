package shop.entity;


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

import java.sql.Date;

@Entity
@Table(name = "TheThanhVien")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TheThanhVien {
    @Id
    @Column(name = "MaThe")
    private String maThe;

    @Column(name = "MauThe")
    private String mauThe;

    @Column(name = "LoaiThe")
    private String loaiThe;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayPhatHanh")
    private Date ngayPhatHanh;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "NgayHuy")
    private Date ngayHuy;

    @Column(name = "TrangThai")
    private Integer TrangThai;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "KhachHang")
    private KhachHang khachHang;


}
