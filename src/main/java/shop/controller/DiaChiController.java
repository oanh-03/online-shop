package shop.controller;

import shop.entity.DiaChi;
import shop.entity.KhachHang;
import shop.repository.DiaChiRepository;
import shop.repository.KhachHangRepository;
import shop.request.DiaChiVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("dia-chi")
public class DiaChiController {
    @Autowired
    private DiaChiRepository diaChiRepository;
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    @Qualifier("dc")
    private DiaChiVM vm;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0 ", name = "p") Integer p, Model model){
        Pageable pageable = PageRequest.of(p,5);
        Page<DiaChi> page = diaChiRepository.findAll(pageable);
        model.addAttribute("lstDC",page);
        return "dia_chi/index";
    }

   @GetMapping("create")
    public String create(Model model){
        List<KhachHang> khachHangs = khachHangRepository.findAll();
        model.addAttribute("khachhangs",khachHangs);
        model.addAttribute("data",vm);
        model.addAttribute("action","/dia-chi/store");
        return "dia_chi/create";
   }
   @PostMapping("store")
    public String store (@Valid @ModelAttribute("data") DiaChiVM vm , BindingResult result ,Model model){
        if(result.hasErrors()){
            List<KhachHang> khachHangs = khachHangRepository.findAll();
            model.addAttribute("khachhangs",khachHangs);
            model.addAttribute("action","/dia-chi/store");
            return "dia_chi/create";
        }
        DiaChi diaChi = new DiaChi();
        diaChi.loadView(vm);
        diaChiRepository.save(diaChi);
        return "redirect:/dia-chi/index";
   }
    @GetMapping("edit/{maDiaChi}")
    public String edit(@PathVariable("maDiaChi") DiaChi diaChi,Model model){
        List<KhachHang> khachHangs = khachHangRepository.findAll();
        vm.loadDomain(diaChi);
        model.addAttribute("khachhangs",khachHangs);
        model.addAttribute("data",vm);
        model.addAttribute("action","/dia-chi/update/"+ diaChi.getMaDiaChi());
        return "dia_chi/create";
    }
    @PostMapping("update/{maDiaChi}")
    public String update (@PathVariable("maDiaChi") DiaChi diaChi,Model model,
                          @Valid @ModelAttribute("data")  DiaChiVM vm , BindingResult result ){
        if(result.hasErrors()){
            List<KhachHang> khachHangs = khachHangRepository.findAll();
            model.addAttribute("data",vm);
            model.addAttribute("khachhangs",khachHangs);
            model.addAttribute("action","/dia-chi/update/"+ diaChi.getMaDiaChi());
            return "dia_chi/create";
        }
        diaChi.loadView(vm);
        diaChiRepository.save(diaChi);
        return "redirect:/dia-chi/index";

    }
    @GetMapping("delete/{maDiaChi}")
    public String delete(@PathVariable("maDiaChi") DiaChi diaChi){
        diaChiRepository.delete(diaChi);
        return "redirect:/dia-chi/index";
    }
}
