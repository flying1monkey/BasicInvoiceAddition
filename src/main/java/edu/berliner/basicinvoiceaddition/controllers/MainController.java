package edu.berliner.basicinvoiceaddition.controllers;


import edu.berliner.basicinvoiceaddition.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/additem")
    public String addItemForm(Model model)
    {
        model.addAttribute("additem", new Product());
        return "additem";
    }

    @PostMapping("/additem")
    public String productSubmit(@ModelAttribute Product product)
    {
        return "showproductdetails";
    }
}
