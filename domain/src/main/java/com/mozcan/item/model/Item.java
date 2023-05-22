package com.mozcan.item.model;

import lombok.*;

@Data
@Builder
@ToString
@With
@EqualsAndHashCode
public class Item {

    private Long id;
    private String name;
    private String type;
    private Long version;
}
