/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.RequestScoped;  
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Chipan
 */

@Named(value = "unitFive")
@SessionScoped
public class unitFive implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
   
   public String submit() { 
       
      if(pageNumber == 0) {          
         return "index?faces-redirect=true";       
      }
      else switch (pageNumber) {
           case 1:
               return "home1";
           case 2:
               return "home2";
           case 3:
               return "home3";
           default:
               return "index?faces-redirect=true";    
       }    
   }
   
   public String home() {
       pageNumber = 0;
       return "index?faces-redirect=true"; 
   }
   
   private int pageNumber = 0;
   public int getPageNumber(){
       return pageNumber;
   }
   
   public void setPageNumber(int pageNumber){
       this.pageNumber = pageNumber;
   }
}
