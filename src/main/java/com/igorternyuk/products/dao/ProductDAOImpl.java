package com.igorternyuk.products.dao;

import com.igorternyuk.products.models.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zenko on 05.02.19.
 */

@Primary
@Repository
public class ProductDAOImpl implements ProductDAO{
    private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

    //@Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addNew(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(product);
        logger.info("Product was successfully added. Product info: " + product);
    }

    @Override
    public void update(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.update(product);
        logger.info("The product with id = " + product.getId()
                + " was successfully updated. Details: " + product);
    }

    @Override
    public void remove(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.load(Product.class, new Integer(id));
        if(product != null){
            session.delete(product);
            logger.info("The product with id = " + product.getId() +
            " was successfully deleted. Details: " + product);
        }
    }

    @Override
    public Product getById(int id) {
        //Session session = sessionFactory.getCurrentSession();
        Session session = sessionFactory.openSession();
        Product product = (Product)session.load(Product.class, new Integer(id));
        if(product != null){
            logger.info("The product with id = " + id + " was found");
            return product;
        } else {
            logger.warn("No products with id = " + id + " found");
            return Product.EMPTY;
        }
    }

    @Override
    public List<Product> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session
                .createQuery("from Product").list();
        return products;
    }

    @Override
    public List<Product> findByName(String filter) {
        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session
                .createQuery("from Product where name like :filter")
                .setParameter("filter", "%" + filter + "%").list();
        return products;
    }
}
