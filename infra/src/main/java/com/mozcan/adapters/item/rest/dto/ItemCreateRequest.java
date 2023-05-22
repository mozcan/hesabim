package com.mozcan.adapters.item.rest.dto;

import com.mozcan.item.usecase.ItemCreate;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemCreateRequest {

    @NotNull
    private String name;
    @NotNull
    private Integer typeId;

    public ItemCreate toModel() {
        return ItemCreate.builder()
                .name(name)
                .typeId(typeId)
                .build();
    }
}
