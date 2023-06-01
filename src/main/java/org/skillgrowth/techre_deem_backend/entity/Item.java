package org.skillgrowth.techre_deem_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.skillgrowth.techre_deem_backend.Controller.dto.ItemDto;

@Entity
public class Item
{

    public Item(int product_id, String item, String item_condition, int price) {
        // Parameterized constructor
        // ...
    }

    public Item() {
        this(0, "Default item", "Default item_condition", 0); // Delegates to the parameterized constructor
    }


    @Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int product_id;

    private String item;

    private String item_condition;

    private int price;

    public Item(ItemDto itemDto) {

    }

    public int getId()
    {
        return product_id;
    }

    public void setId( int product_id )
    {
        this.product_id = product_id;
    }

    public String getItem()
    {
        return item;
    }

    public void setName( String item )
    {
        this.item = item;
    }

    public String getItem_condition()
    {
        return item_condition;
    }

    public void setDescription( String item_condition )
    {
        this.item_condition = item_condition;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice( int price)
    {
        this.price = price;
    }
}
