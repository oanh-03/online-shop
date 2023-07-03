package shop.repository;

import shop.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PhieuGiamGiaRepository extends JpaRepository<PhieuGiamGia,String> {
    @Query("SELECT p FROM PhieuGiamGia p WHERE (?1 IS NULL OR p.ngayBatDau >= ?1) AND (?2 IS NULL OR p.ngayKetThuc <= ?2) AND (?3 IS NULL OR p.khachHang.maKhachHang=?3)")
    Page<PhieuGiamGia> search(Date startDate, Date endDate, Long maKhachHang, Pageable pageable);
}
