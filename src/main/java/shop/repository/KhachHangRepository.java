package shop.repository;

import shop.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {
    @Query("SELECT kg FROM KhachHang kg WHERE (kg.tenKhachHang LIKE ?1 OR kg.sdt LIKE ?1) AND (?2 IS NULL OR kg.hangKhachHang.maHang=?2)")
    Page<KhachHang> searchByKeywordAndHang(String keyword, Long maHang, Pageable pageable);

}
