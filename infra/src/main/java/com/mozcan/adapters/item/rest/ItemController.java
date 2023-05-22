package com.mozcan.adapters.item.rest;

import com.mozcan.adapters.item.rest.dto.ItemCreateRequest;
import com.mozcan.item.ItemFacade;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemFacade itemFacade;

    public ItemController(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createBranch(@RequestBody @Valid ItemCreateRequest itemCreateRequest) {

        var item = itemFacade.create(itemCreateRequest.toModel());

        return new ResponseEntity<>(item,HttpStatus.CREATED);
    }

}
