package com.igorternyuk.products.dao;

import com.igorternyuk.products.models.Product;

import java.util.List;

/**
 * Created by zenko on 05.02.19.
 */

public interface ProductDAO {
    void addNew(Product product);
    void update(Product product);
    void remove(int id);
    Product getById(int id);
    List<Product> getAll();
    List<Product> findByName(String filter);
}
