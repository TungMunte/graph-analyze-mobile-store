package com.example.demo.controller;

import com.example.demo.entity.Coupon;
import com.example.demo.entity.ProductReport;
import com.example.demo.entity.UserReport;
import com.example.demo.service.impl.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ReportController {
    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping(value = "/api/demo")
    public ResponseEntity<List<Coupon>> demo() {
        return new ResponseEntity<>(reportService.demo(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/top5product")
    public ResponseEntity<List<ProductReport>> top5Product() {
        return new ResponseEntity<>(reportService.top5Product(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/top5userWithoutCoupon")
    public ResponseEntity<List<UserReport>> top5UserWithoutCoupon() {
        return new ResponseEntity<>(reportService.top5UserWithoutCoupon(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/top5userWithCoupon")
    public ResponseEntity<List<UserReport>> top5UserWithCoupon() {
        return new ResponseEntity<>(reportService.top5UserWithCoupon(), HttpStatus.OK);
    }
}
