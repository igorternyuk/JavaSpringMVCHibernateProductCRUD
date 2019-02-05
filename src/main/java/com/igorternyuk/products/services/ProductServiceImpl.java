package com.igorternyuk.products.services;

import com.igorternyuk.products.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zenko on 05.02.19.
 */

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    //@Qualifier("productDAO")
    private ProductDAO productDAO;


}
