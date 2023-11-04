package com.example.demo.procedure;

import com.example.demo.entity.Coupon;
import com.example.demo.entity.ProductReport;
import com.example.demo.entity.UserReport;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProcedureRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Coupon> demo() {
        StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("PRINT_CONTRACT", Coupon.class);
        procedureQuery.registerStoredProcedureParameter("results", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        @SuppressWarnings("unchecked") List<Coupon> resultList = procedureQuery.getResultList();
        resultList.forEach(System.out::println);
        return resultList;
    }

    public List<ProductReport> top5Product() {
        StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("TOP_5_PRODUCT", ProductReport.class);
        procedureQuery.registerStoredProcedureParameter("products_cursor", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        @SuppressWarnings("unchecked") List<ProductReport> resultList = procedureQuery.getResultList();
        resultList.forEach(System.out::println);
        return resultList;
    }

    public List<UserReport> top5UserWithoutCoupon() {
        StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("TOP_5_USER_WITHOUT_COUPON", UserReport.class);
        procedureQuery.registerStoredProcedureParameter("users_cursor", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        @SuppressWarnings("unchecked") List<UserReport> resultList = procedureQuery.getResultList();
        resultList.forEach(System.out::println);
        return resultList;
    }

    public List<UserReport> top5UserWithCoupon() {
        StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("TOP_5_USER_WITH_COUPON", UserReport.class);
        procedureQuery.registerStoredProcedureParameter("users_cursor", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        @SuppressWarnings("unchecked") List<UserReport> resultList = procedureQuery.getResultList();
        return resultList;
    }
}
