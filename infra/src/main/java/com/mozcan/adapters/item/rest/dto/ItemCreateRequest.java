package com.mozcan.adapters.item.rest.dto;

import com.mozcan.item.ItemFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/items")
public class ItemCreateRequest {

    private ItemFacade itemFacade;

    public ItemCreateRequest(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }
}
