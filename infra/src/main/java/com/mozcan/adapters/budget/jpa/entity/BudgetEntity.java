package com.mozcan.adapters.budget.jpa.entity;

import com.mozcan.adapters.item.jpa.entity.ItemEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "BUDGET")
public class BudgetEntity {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "MONTH")
    private Integer month;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ITEM_ID", nullable=false)
    private ItemEntity itemEntity;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "OBJ_VERSION")
    @Version
    private Long version;

}
