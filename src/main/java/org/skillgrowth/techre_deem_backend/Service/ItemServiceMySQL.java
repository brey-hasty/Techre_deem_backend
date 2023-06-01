package org.skillgrowth.techre_deem_backend.Service;


import org.skillgrowth.techre_deem_backend.entity.Item;
import java.util.List;


public interface ItemServiceMySQL{

    Item save(Item item );

    boolean delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
