package com.igorternyuk.products.controllers;

import com.igorternyuk.products.models.Product;
import com.igorternyuk.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zenko on 05.02.19.
 */

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("listProducts", productService.getAll());
        return "products";
    }

    @RequestMapping("/productDetails/{id}")
    public String showProductDetails(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "productDetails";
    }

    @RequestMapping("/find")
    public String findProductsByName(@RequestParam("searchFilter") String filter, Model model){
        model.addAttribute("searchResult", productService.findByName(filter));
        return "searchResults";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.addNew(product);
        return "redirect: /products";
    }

    @RequestMapping("/addProduct")
    public String addProduct(){
        return "addProduct";
    }

    @RequestMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "editProduct";
    }

    @RequestMapping("/updateProduct")
    public String updateProduct(@ModelAttribute("product") Product product){
        productService.update(product);
        return "redirect: /products";
    }


    @RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id") int id){
        productService.remove(id);
        return "redirect: /products";
    }
}
