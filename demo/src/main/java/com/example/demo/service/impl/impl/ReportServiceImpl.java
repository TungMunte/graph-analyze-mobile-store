package com.example.demo.service.impl.impl;

import com.example.demo.entity.ProductReport;
import com.example.demo.entity.UserReport;
import com.example.demo.procedure.ProcedureRepo;
import com.example.demo.service.impl.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReportServiceImpl implements ReportService {

    private ProcedureRepo procedureRepo;

    public ReportServiceImpl(ProcedureRepo procedureRepo) {
        this.procedureRepo = procedureRepo;
    }


    @Override
    public List<ProductReport> top5Product() {
        return procedureRepo.top5Product();
    }

    @Override
    public List<UserReport> top5UserWithoutCoupon() {
        return procedureRepo.top5UserWithoutCoupon();
    }

    @Override
    public List<UserReport> top5UserWithCoupon() {
        return procedureRepo.top5UserWithCoupon();
    }
}
