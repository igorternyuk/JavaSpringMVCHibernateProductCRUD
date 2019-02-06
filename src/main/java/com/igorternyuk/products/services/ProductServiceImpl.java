package com.igorternyuk.products.services;

import com.igorternyuk.products.dao.ProductDAO;
import com.igorternyuk.products.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by zenko on 05.02.19.
 */

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDAO productDAO;

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    @Transactional
    public void addNew(Product product) {
        this.productDAO.addNew(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        this.productDAO.update(product);
    }

    @Override
    @Transactional
    public void remove(int id) {
        this.productDAO.remove(id);
    }

    @Override
    @Transactional
    public Product getById(int id) {
        return this.productDAO.getById(id);
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        return this.productDAO.getAll();
    }

    @Override
    @Transactional
    public List<Product> findByName(String filter) {
        return this.productDAO.findByName(filter);
    }
}
