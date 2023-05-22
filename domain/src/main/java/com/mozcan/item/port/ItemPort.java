package com.mozcan.item.port;

import com.mozcan.item.model.Item;
import com.mozcan.item.usecase.ItemCreate;

public interface ItemPort {

    Item create(ItemCreate itemCreate);
}
