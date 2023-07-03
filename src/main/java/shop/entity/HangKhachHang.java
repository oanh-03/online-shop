package shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "HangKhachHang")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder

public class HangKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHang")
    private Integer maHang;

    @Column(name = "TenHang")
    private String tenHang;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "DiemToiThieu")
    private Integer diemToiThieu;

    @Column(name = "TrangThai")
    private Integer trangThai;

}
