package org.skillgrowth.techre_deem_backend.Controller;


import org.skillgrowth.techre_deem_backend.entity.Item;
import org.skillgrowth.techre_deem_backend.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController{

    final repository itemRepository;


    public ItemController(@Autowired repository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }
}
