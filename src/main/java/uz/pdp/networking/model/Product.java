package uz.pdp.networking.model;

import lombok.Data;
import uz.pdp.networking.model.enumerator.ProductCategory;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int quantity;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;
}