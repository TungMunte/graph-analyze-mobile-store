package com.example.demo.service.impl;

import com.example.demo.entity.ProductReport;
import com.example.demo.entity.UserReport;

import java.util.List;

public interface ReportService {
    List<ProductReport> top5Product();

    List<UserReport> top5UserWithoutCoupon();

    List<UserReport> top5UserWithCoupon();
}
