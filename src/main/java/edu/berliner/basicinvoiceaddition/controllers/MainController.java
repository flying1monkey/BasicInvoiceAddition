package edu.berliner.basicinvoiceaddition.controllers;


import edu.berliner.basicinvoiceaddition.Product;
import edu.berliner.basicinvoiceaddition.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired //prevents requirement to reinstantiate in every method
    ProductRepository productRepository;

    @GetMapping("/")
    public String showIndex(Model model)
    {
        String myMessage = "Welcome to the InvoiceApp!";
        model.addAttribute("message", myMessage);
        return "index";
    }

    @GetMapping("/additem")
    public String addItemForm(Model model)
    {
        model.addAttribute("additem", new Product());
        return "additem";
    }

    @PostMapping("/additem")
    public String productSubmit(@Valid @ModelAttribute ("additem") Product product, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "additem";
        }
        productRepository.save(product);
        return "showproductdetails";
    }

    @GetMapping("/showproducts")
    public @ResponseBody String showAllProducts()
    {
        Iterable <Product> productList = productRepository.findAll();

        return "something";
    }
}
