/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import repository.CarRepositoryBean;
import repository.Car;

/**
 *
 * @author Chipan
 */
@Named(value = "carSelectionBean")
@RequestScoped
public class CarSelectionBean implements Serializable{

    
    // Inject the car repository
    // DO NOT REMOVE THE CODE
    @EJB CarRepositoryBean repository;
   
    /**
     * Action method to redirect to displayInfo facelets page.
     * @return target page name
     */
    private int carID;
    private float price;
    
    public String index(){
        return "home";
    }
    
    public String submit(){
        repository.query(carID).setPrice(price);
        return "home";
    }
    
    public int getCarID(){
        return this.carID;
       
    }
    
    public void setCarID(int carID){
        this.carID = carID;
        setPrice(repository.query(carID).getPrice());
    }
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    public List<Car> getCarItems(){
        return repository.findAll();
    }
    
    public Car getCarValue(){
        return repository.query(this.carID);
    }
}