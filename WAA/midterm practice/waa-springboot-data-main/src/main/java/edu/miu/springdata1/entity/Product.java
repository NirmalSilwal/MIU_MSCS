package edu.miu.springdata1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

    //@OneToMany
    // UNCOMMENT FOR UNI-DIRECTIONAL JOIN COLUMN
    //@JoinColumn(name = "product_id")

    // UNCOMMENT FOR BI-DIRECTIONAL JOIN COLUMN
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Review> reviews;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    @JsonBackReference
    private User user;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;

}
