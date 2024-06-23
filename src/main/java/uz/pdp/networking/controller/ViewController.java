package uz.pdp.networking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.networking.model.enumerator.ProductCategory;
import uz.pdp.networking.repository.ProductRepository;

@Controller
public class ViewController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/crm")
    public String crm(Model model) {
        model.addAttribute("products", productRepository.findByCategory(ProductCategory.CRM));
        return "crm";
    }

    @GetMapping("/erp")
    public String erp(Model model) {
        model.addAttribute("products", productRepository.findByCategory(ProductCategory.ERP));
        return "erp";
    }

    @GetMapping("/wms")
    public String wms(Model model) {
        model.addAttribute("products", productRepository.findByCategory(ProductCategory.WMS));
        return "wms";
    }
}