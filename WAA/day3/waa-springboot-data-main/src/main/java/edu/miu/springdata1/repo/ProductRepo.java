package edu.miu.springdata1.repo;

import edu.miu.springdata1.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {


}
