package shop.config;

import shop.request.DiaChiVM;
import shop.request.KhachHangVM;
import shop.request.PhieuGiamGiaVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("kh")
    public KhachHangVM getNV() {
        KhachHangVM vm = new KhachHangVM();
        vm.setTenKhachHang(vm.getTenKhachHang());
        vm.setSdt(vm.getSdt());
        vm.setGioiTinh(vm.getGioiTinh());
        vm.setHangKhachHang(vm.getHangKhachHang());
        return vm;
    }

    @Bean("phieu")
    public PhieuGiamGiaVM getPhieu() {
        PhieuGiamGiaVM vm = new PhieuGiamGiaVM();
        vm.setTenPhieu(vm.getTenPhieu());
        vm.setNgayBatDau(vm.getNgayBatDau());
        vm.setNgayKetThuc(vm.getNgayKetThuc());
        vm.setGiaTriGiam(vm.getGiaTriGiam());
        vm.setGiaTriGiamToiDa(vm.getGiaTriGiamToiDa());
        vm.setHinhThucGiam(vm.getHinhThucGiam());
        vm.setTrangThai(vm.getTrangThai());
        vm.setKhachHang(vm.getKhachHang());
        return vm;
    }

    @Bean("dc")
    public DiaChiVM getDC() {
        DiaChiVM vm = new DiaChiVM();
        vm.setTenDiaChi(vm.getTenDiaChi());
        vm.setMoTaChiTiet(vm.getMoTaChiTiet());
        vm.setTinhThanhPho(vm.getTinhThanhPho());
        vm.setQuanHuyen(vm.getQuanHuyen());
        vm.setPhuongXa(vm.getPhuongXa());
        vm.setDuongPho(vm.getDuongPho());
        vm.setKhachHang(vm.getKhachHang());
        return vm;
    }
}
