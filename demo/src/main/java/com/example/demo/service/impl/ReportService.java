package com.example.demo.service.impl;

import com.example.demo.entity.*;

import java.util.List;

public interface ReportService {
    List<Coupon> demo();
    List<ProductReport> top5Product();

    List<UserReport> top5UserWithoutCoupon();

    List<UserReport> top5UserWithCoupon();
}
