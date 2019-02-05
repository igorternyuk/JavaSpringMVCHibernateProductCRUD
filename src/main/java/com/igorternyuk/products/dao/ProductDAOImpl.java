package com.igorternyuk.products.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by zenko on 05.02.19.
 */

@Primary
@Repository
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private SessionFactory sessionFactory;


}
