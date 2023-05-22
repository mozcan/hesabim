package com.mozcan.item;

import com.mozcan.item.model.Item;
import com.mozcan.item.port.ItemPort;
import com.mozcan.item.usecase.ItemCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ItemFacade {

    private ItemPort itemPort;

    public ItemFacade(ItemPort itemPort) {
        this.itemPort = itemPort;
    }

    public Item create(ItemCreate itemCreate) {
        return itemPort.create(itemCreate);
    }
}
