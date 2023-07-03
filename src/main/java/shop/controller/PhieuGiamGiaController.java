package shop.controller;


import shop.entity.KhachHang;
import shop.entity.PhieuGiamGia;
import shop.repository.KhachHangRepository;
import shop.repository.PhieuGiamGiaRepository;
import shop.request.PhieuGiamGiaVM;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/phieu-giam-gia")
public class PhieuGiamGiaController {
    @Data
    public static class SearchForm {
        @DateTimeFormat(pattern = "dd/MM/yyyy")
        Date fromDate;

        @DateTimeFormat(pattern = "dd/MM/yyyy")
        Date toDate;

        Long maKhachHang;
    }

    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
//    @Qualifier("phieu")
    private PhieuGiamGiaVM vm;

    @GetMapping("hien-thi")
    public String index(@RequestParam(defaultValue = "0 ", name = "p") Integer p, Model model) {
        Pageable pageable = PageRequest.of(p, 5);
        List<KhachHang> list = khachHangRepository.findAll();
        Page<PhieuGiamGia> ds = phieuGiamGiaRepository.findAll(pageable);
        model.addAttribute("data", ds);
        model.addAttribute("searchForm", new SearchForm());
        model.addAttribute("khachhangs", list);
        return "/phieu_giam_gia/index";
    }

    @PostMapping("hien-thi")
    public String search(@RequestParam(defaultValue = "0", name = "p") Integer p,
                         @ModelAttribute("searchForm") SearchForm searchForm, Model model) {
        Pageable pageable = PageRequest.of(p, 5);
        List<KhachHang> list = khachHangRepository.findAll();
        Page<PhieuGiamGia> ds = phieuGiamGiaRepository.search(
                searchForm.getFromDate(), searchForm.getToDate(), searchForm.getMaKhachHang(), pageable
        );
        model.addAttribute("data", ds);
        model.addAttribute("khachhangs", list);
        return "/phieu_giam_gia/index";
    }

    @GetMapping("delete/{maPhieu}")
    public String delete(@PathVariable("maPhieu") PhieuGiamGia phieuGiamGia) {
        this.phieuGiamGiaRepository.delete(phieuGiamGia);
        return "redirect:/phieu-giam-gia/hien-thi";
    }

    @GetMapping("edit/{maPhieu}")
    public String edit(@PathVariable("maPhieu") PhieuGiamGia phieuGiamGia, Model model) {
        List<KhachHang> list = khachHangRepository.findAll();
        vm.loadFromDomainModel(phieuGiamGia);
        model.addAttribute("data", vm);
        model.addAttribute("khachhangs", list);
        model.addAttribute("action", "/phieu-giam-gia/update/" + phieuGiamGia.getMaPhieu());
        return "/phieu_giam_gia/update";
    }
    @GetMapping("detail/{maPhieu}")
    public String detail(@PathVariable("maPhieu") PhieuGiamGia phieuGiamGia, Model model) {
        List<KhachHang> list = khachHangRepository.findAll();
        vm.loadFromDomainModel(phieuGiamGia);
        model.addAttribute("data", vm);
        model.addAttribute("khachhangs", list);
        model.addAttribute("action", "/phieu-giam-gia/detail/" + phieuGiamGia.getMaPhieu());
        model.addAttribute("pg", phieuGiamGia);
        return "/phieu_giam_gia/detail";
    }

    @PostMapping("update/{maPhieu}")
    public String update(
            @PathVariable("maPhieu") PhieuGiamGia phieuGiamGia,
            Model model,
            @Valid @ModelAttribute("data") PhieuGiamGiaVM phieuGiamGiaVM,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            List<KhachHang> list = khachHangRepository.findAll();
            model.addAttribute("data", phieuGiamGiaVM);
            model.addAttribute("khachhangs", list);
            model.addAttribute("action", "/phieu-giam-gia/update/" + phieuGiamGia.getMaPhieu());
            return "/phieu_giam_gia/update";
        }
        phieuGiamGia.loadFromViewModel(phieuGiamGiaVM);
        this.phieuGiamGiaRepository.save(phieuGiamGia);
        return "redirect:/phieu-giam-gia/hien-thi";
    }

    @RequestMapping("/sort")
    public String sort(@RequestParam(name = "p", defaultValue = "0") Integer page, Model model) {
        Sort sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "ngayBatDau"),
                new Sort.Order(Sort.Direction.ASC, "tenPhieu"));
        Pageable pageable = PageRequest.of(page, 5, sort);
        List<KhachHang> list = khachHangRepository.findAll();
        Page<PhieuGiamGia> ds = phieuGiamGiaRepository.findAll(pageable);
        model.addAttribute("data", ds);
        model.addAttribute("khachhangs", list);
        return "/phieu_giam_gia/index";
    }
}


