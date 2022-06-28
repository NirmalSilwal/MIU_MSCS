package edu.miu.springdata1.service.impl;

import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.repo.ProductRepo;
import edu.miu.springdata1.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
//@RequiredArgsConstructor
@AllArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
//        var result= new ArrayList<Product>();
//        productRepo.findAll().forEach(result::add);
//        return result;

         return productRepo.findAll();
    }
}
