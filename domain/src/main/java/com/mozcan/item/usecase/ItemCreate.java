package com.mozcan.item.usecase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCreate {

    private String name;
    private Integer typeId;

}
