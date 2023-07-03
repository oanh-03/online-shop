package shop.controller;


import shop.entity.HangKhachHang;
import shop.entity.KhachHang;
import shop.repository.HangKhachHangRepository;
import shop.repository.KhachHangRepository;
import shop.request.KhachHangVM;
import shop.service.KhachHangService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Data
    public static class SearchForm1 {
        String keyword = "";
        Long maHang;

    }

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private HangKhachHangRepository hangKhachHangRepository;
    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    @Qualifier("kh")
    private KhachHangVM vm;


    @GetMapping("/hien-thi")
    public String showKhachHangList(@RequestParam(name = "p", defaultValue = "0") Integer page, Model model, @ModelAttribute("error") String error) {
        Pageable pageable = PageRequest.of(page, 5);
        List<HangKhachHang> hangKhachHangList = hangKhachHangRepository.findAll();
        Page<KhachHang> khachHangPage = khachHangRepository.findAll(pageable);
        model.addAttribute("hangKhachHang", hangKhachHangList);
        model.addAttribute("lstKH", khachHangPage);
        model.addAttribute("data", vm);
        model.addAttribute("searchForm", new SearchForm1());
        model.addAttribute("error", error);
        model.addAttribute("action", "/khach-hang/add");
        return "khach_hang/index";
    }

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "0", name = "p") Integer p, @ModelAttribute("searchForm") SearchForm1 searchForm,
                         Model model) {
        Pageable pageable = PageRequest.of(p, 5);
        List<HangKhachHang> hangKhachHangList = hangKhachHangRepository.findAll();
        Page<KhachHang> ds = khachHangService.search(searchForm.keyword, searchForm.maHang, pageable);
        model.addAttribute("lstKH", ds);
        model.addAttribute("data", vm);
        model.addAttribute("hangKhachHang", hangKhachHangList);
        return "khach_hang/index";
    }

    @PostMapping("/add")
    public String addKhachHang(@Valid @ModelAttribute("data") KhachHangVM vm, BindingResult bindingResult, Model model,RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            List<HangKhachHang> list = hangKhachHangRepository.findAll();
            Pageable pageable = PageRequest.of(0, 5);
            Page<KhachHang> khachHangPage = khachHangRepository.findAll(pageable);
            model.addAttribute("hangKhachHang", list);
            model.addAttribute("lstKH", khachHangPage);
            model.addAttribute("searchForm", new SearchForm1());
            return "khach_hang/index";
        }

        KhachHang khachHang = new KhachHang();
        khachHang.loadView(vm);
        khachHangRepository.save(khachHang);
        redirectAttributes.addFlashAttribute("message", "Add thành công");
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("delete/{maKhachHang}")
    public String delete(@PathVariable("maKhachHang") KhachHang khachHang, RedirectAttributes redirectAttributes) {
        khachHangRepository.delete(khachHang);

        boolean hasRecords = khachHangRepository.count() > 0;

        if (hasRecords) {
            redirectAttributes.addFlashAttribute("message", "Đã xóa thành công bản ghi.");
        } else {
            redirectAttributes.addFlashAttribute("message", "Không còn bản ghi nào để xóa.");
        }

        return "redirect:/khach-hang/hien-thi";
    }

    @RequestMapping("/sort")
    public String sort(@RequestParam(name = "p", defaultValue = "0") Integer page, Model model) {
        Sort sort = Sort.by(Sort.Direction.ASC, "tenKhachHang");
        Pageable pageable = PageRequest.of(page, 5, sort);
        List<HangKhachHang> hangKhachHangList = hangKhachHangRepository.findAll();
        Page<KhachHang> khachHangPage = khachHangRepository.findAll(pageable);
        model.addAttribute("hangKhachHang", hangKhachHangList);
        model.addAttribute("lstKH", khachHangPage);
        model.addAttribute("data", new KhachHangVM());
        model.addAttribute("searchForm", new SearchForm1());
        return "khach_hang/index";
    }
}


