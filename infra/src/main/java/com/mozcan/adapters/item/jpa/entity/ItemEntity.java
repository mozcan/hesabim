package com.mozcan.adapters.item.jpa.entity;

import com.mozcan.adapters.budget.jpa.entity.BudgetEntity;
import com.mozcan.item.model.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Table(name = "ITEM",
        uniqueConstraints = {
                @UniqueConstraint(name = "UniqeItemName", columnNames = {"NAME"})})
public class ItemEntity {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TYPE")
    private EnumItemType itemType;

    @OneToMany(mappedBy="itemEntity",fetch = FetchType.LAZY)
    private Set<BudgetEntity> budgetEntitySet;

    @Column(name = "OBJ_VERSION")
    @Version
    private Long version;

    public Item toModel() {
        return Item.builder()
                .id(id)
                .name(name)
                .version(version)
                .build();
    }
}
