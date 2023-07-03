package shop.service;

import shop.entity.HangKhachHang;
import shop.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    public Page<KhachHang> search(String search, Long maHang, Pageable pageable);
    public List<HangKhachHang> getDsKhachHang();

}
