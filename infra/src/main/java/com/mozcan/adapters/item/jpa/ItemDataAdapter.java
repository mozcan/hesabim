package com.mozcan.adapters.item.jpa;

import com.mozcan.adapters.item.jpa.entity.EnumItemType;
import com.mozcan.adapters.item.jpa.entity.ItemEntity;
import com.mozcan.adapters.item.jpa.repository.ItemJpaRepository;
import com.mozcan.item.model.Item;
import com.mozcan.item.port.ItemPort;
import com.mozcan.item.usecase.ItemCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class ItemDataAdapter implements ItemPort {

    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Item create(ItemCreate itemCreate) {
        var itemEntity = new ItemEntity();

        itemEntity.setName(itemCreate.getName());
        itemEntity.setItemType(Arrays.stream(EnumItemType.values())
                            .filter(itemType -> itemType.getValue().equals(itemCreate.getTypeId())).findFirst().get());

        return itemJpaRepository.save(itemEntity).toModel();
    }
}
