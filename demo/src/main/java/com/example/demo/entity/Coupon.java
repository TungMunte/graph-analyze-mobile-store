package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@NamedStoredProcedureQuery(name = "Car.getTotalCardsbyModelEntity",
        procedureName = "GET_TOTAL_CARS_BY_MODEL", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "model_in", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "count_out", type = Integer.class)})
@Table(name = "coupon")
public class Coupon {
    @Id
    @Column(name = "coupon_id")
    private Integer couponId;

    @Column(name = "date_start")
    @Temporal(TemporalType.DATE)
    private java.sql.Date dateStart;

    @Column(name = "date_end")
    @Temporal(TemporalType.DATE)
    private java.sql.Date dateEnd;

    @Column(name = "reduce")
    private Integer reduce;
}
