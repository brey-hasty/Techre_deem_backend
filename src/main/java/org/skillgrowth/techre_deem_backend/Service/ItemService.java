package org.skillgrowth.techre_deem_backend.Service;

import org.skillgrowth.techre_deem_backend.entity.Item;
import org.skillgrowth.techre_deem_backend.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ItemService
{
    private final repository itemRepository;

    public ItemService(@Autowired repository itemRepository )
    {
        this.itemRepository = itemRepository;
    }


    public Item save(Item item )
    {
        //TODO implement this method
        return null;
    }


    public void delete( int product_Id )
    {
        //TODO implement this method
    }


    public List<Item> all()
    {
        //TODO implement this method
        return null;
    }


    public Item findById( int product_Id )
    {
        //TODO implement this method
        return null;
    }


}
