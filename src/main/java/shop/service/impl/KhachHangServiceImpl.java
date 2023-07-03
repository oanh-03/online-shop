package shop.service.impl;

import shop.entity.HangKhachHang;
import shop.entity.KhachHang;
import shop.repository.HangKhachHangRepository;
import shop.repository.KhachHangRepository;
import shop.repository.TheThanhVienRepository;
import shop.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    TheThanhVienRepository theThanhVienRepo;

    @Autowired
    HangKhachHangRepository hangKhachHangRepo;

    @Autowired
    KhachHangRepository repo;
    @Override
    public Page<KhachHang> search(String keyword, Long maHang, Pageable pageable) {
            return repo.searchByKeywordAndHang("%" + keyword + "%", maHang, pageable);
    }

    @Override
    public List<HangKhachHang> getDsKhachHang() {
        return hangKhachHangRepo.findAll();
    }
}
