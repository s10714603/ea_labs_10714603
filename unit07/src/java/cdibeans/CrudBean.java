/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entities.Item;
import ejb.ItemFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Chipan
 */
@Named(value = "crudBean")
@SessionScoped
public class CrudBean implements Serializable {
    
    @EJB
    private ItemFacade itemFacade;
    
    private Item newItem;
    
    private Item ItemID;
    
    /**
     * Creates a new instance of CrudBean
     */
    public CrudBean() {
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }
    
    public Item getItemID() {
        return ItemID;
    }

    public void setItemID(Item ItemID) {
        this.ItemID = ItemID;
    }
    
    
    public List<Item> findAll(){
        return itemFacade.findAll();
    }
    
    public String goNewItemPage(){
        this.newItem = new Item();
        return "createItem";
    }
    
    public String addItem(){
        itemFacade.create(newItem);
        return "itemList";
    }
    
    public String updateItem(long id){
        this.ItemID = itemFacade.find(id);
        itemFacade.edit(ItemID);
        return "updateItem";
    }
    
    public String updateItemSummit(){
        itemFacade.edit(ItemID);
        return "itemList";
    }
    
    public String deleteItem(long id){
        itemFacade.remove(itemFacade.find(id));
        return "itemList";
    }
    
}