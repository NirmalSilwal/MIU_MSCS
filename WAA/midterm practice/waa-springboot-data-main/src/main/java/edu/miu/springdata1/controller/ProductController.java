package edu.miu.springdata1.controller;

import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.Review;
import edu.miu.springdata1.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getById(@PathVariable int id) {
//        var product = productService.getById(id);
//        return ResponseEntity.ok(product);
//    }


    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Product p) {
        productService.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Product product) {
        //call service
//        productService.update(id, product);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getReviewsByProductId(@PathVariable int id) {
        return productService.getById(id).getReviews();
    }

    @GetMapping("/{id}/test")
    public ResponseEntity test(@PathVariable int id) {
        // for demo purposes, this request is not authorized.
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
    }

}
