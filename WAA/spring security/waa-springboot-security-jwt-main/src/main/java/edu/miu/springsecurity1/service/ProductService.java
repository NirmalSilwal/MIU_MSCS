package edu.miu.springsecurity1.service;


import edu.miu.springsecurity1.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
