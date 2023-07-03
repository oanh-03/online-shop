package shop.repository;

import shop.entity.TheThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheThanhVienRepository extends JpaRepository<TheThanhVien,String> {
}
