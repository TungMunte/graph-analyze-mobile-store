package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class ProductReport {
    @Id
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "TOTAL_AMOUNT")
    private Integer totalAmount;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "TOTAL")
    private Integer total;

}
