/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import entityControl.AbstractFacade;
import entities.Item;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 * @since Apr 29, 2019
 */
@Stateless
@LocalBean
public class ItemFacade extends AbstractFacade<Item>{

    @PersistenceContext(unitName = "AuctionAppDemoPU")
    private EntityManager em;
    
    // default constructor
    public ItemFacade() {
        super(Item.class);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}