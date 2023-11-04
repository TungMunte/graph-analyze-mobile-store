package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "ram")
    private Integer ram;

    @Column(name = "price")
    private Integer price;

    @Column(name = "brand")
    private String brand;

    @Column(name = "screen_size")
    private Integer screenSize;

    @Column(name = "internal_memory ")
    private Integer internalMemory;

    @Column(name = "coupon_id")
    private Integer couponId;
}
