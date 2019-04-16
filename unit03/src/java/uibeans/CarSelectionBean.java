/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import repository.Car;
import repository.CarRepositoryBean;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "carSelectionBean")
@SessionScoped
public class CarSelectionBean implements Serializable{

    
    // Inject the car repository
    // DO NOT REMOVE THE CODE
    @EJB CarRepositoryBean repository;
   
    /**
     * Action method to redirect to displayInfo facelets page.
     * @return target page name
     */
    public String dispalyInfo(){
        
        return "displayInfo?faces-redirect=true";
        //return "displayInfo.xhml";
    }
    
    private int carValue;
    
    
    
    public void setCarValue(int id){
        this.carValue = id;
    }
    public int getCarValue(){
        return this.carValue;
    }
    
    
    
    public List<Car> getCars(){
        return repository.findAll();
    }
    
    
    public String actionDisplay(){
        return "displayInfo";
    }
   
    public Car getCarByValue(){
        return repository.query(this.carValue);
    }
    
    public String getWebRoot(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        return ec.getRealPath("/");
    }
    
}
