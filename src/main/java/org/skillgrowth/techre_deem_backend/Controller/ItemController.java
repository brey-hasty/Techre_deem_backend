package org.skillgrowth.techre_deem_backend.Controller;


import org.skillgrowth.techre_deem_backend.Controller.dto.ItemDto;
import org.skillgrowth.techre_deem_backend.Service.ItemService;
import org.skillgrowth.techre_deem_backend.entity.Item;
import org.skillgrowth.techre_deem_backend.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemController{

   private final repository itemRepository;
    private final ItemService itemService;


    public ItemController(@Autowired repository itemRepository, ItemService itemService)
    {
        this.itemRepository = itemRepository;
        this.itemService = itemService;
    }

    @GetMapping
    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }



    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> items = itemService.all();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PostMapping
    @CrossOrigin
    public Item save( @RequestBody ItemDto itemDto )
    {
        return itemService.save( new Item( itemDto) );
    }

    @GetMapping("/{id}")
    public Item findItemById( @PathVariable Integer id ){
        return itemService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService.findById( id );
        item.setName( itemDto.getItem() );
        item.setDescription( itemDto.getItem_condition() );
        item.setPrice( itemDto.getPrice() );
        return itemService.save( item );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }


}
