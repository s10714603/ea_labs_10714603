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
import repository.CarRepositoryBean;
import repository.Car;


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
    
    private Integer carID;
    
    public String dispalyInfo(){
        return "displayInfo?faces-redirect=true";
    }
    
    public Integer getCarID(){
        return this.carID;
    }
    
    public void setCarID(Integer carID){
        this.carID = carID;
    }
    
    public List<Car> getcarItems(){
        return repository.findAll();
    }
    
    public Car getcarValue(){
        return repository.query(this.carID);
    }
}
