package com.example.demo.repository;

import com.example.demo.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
    @Procedure("PRINT_CONTRACT")
    List<Coupon> getDemo();
}
