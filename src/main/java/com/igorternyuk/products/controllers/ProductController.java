package com.igorternyuk.products.controllers;

import com.igorternyuk.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by zenko on 05.02.19.
 */

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
}
