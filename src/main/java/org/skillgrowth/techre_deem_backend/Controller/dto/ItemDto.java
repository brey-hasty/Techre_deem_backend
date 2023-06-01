package org.skillgrowth.techre_deem_backend.Controller.dto;

public class ItemDto
{

    private int product_Id;
    private String item;

    private String description;

    private String item_condition;

    private int price;

    public ItemDto( int product_Id, String item, String item_condition, int price)
    {

        this.product_Id = product_Id;
        this.item = item;
        this.item_condition = item_condition;
        this.price = price;
    }


    public int getProduct_Id()
    {
        return product_Id;
    }


    public void setProduct_Id( int product_id )
    {
        this.product_Id= product_id;
    }

    public String getItem()
    {
        return item;
    }

    public void setItem( String Item )
    {
        this.item = item;
    }

    public String getItem_condition()
    {
        return item_condition;
    }

    public void setItem_condition( String item_condition )
    {
        this.item_condition = item_condition;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice( int price )
    {
        this.price = price;
    }


}