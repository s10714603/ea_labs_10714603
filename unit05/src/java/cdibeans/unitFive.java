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
   
   private Integer PageNumber = 0;
   
   
   public String submit() { 
       
      if(PageNumber == 0) {          
         return "index?faces-redirect=true";       
      }
      else switch (PageNumber) {
           case 1:
               return "page1?faces-redirect=true";
           case 2:
               return "page2?faces-redirect=true";
           case 3:
               return "page3?faces-redirect=true";
           default:
               return "index?faces-redirect=true";    
       }    
   }
   
   public String home() {
       PageNumber = 0;
       return "index?faces-redirect=true";
   }
   
   public Integer getPageNumber(){
       return PageNumber;
   }
   
   public void setPageNumber(Integer PageNumber){
       this.PageNumber = PageNumber;
   }
}