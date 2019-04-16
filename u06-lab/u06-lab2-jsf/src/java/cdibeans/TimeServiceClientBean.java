package cdibeans;

import ejb3.session.TimeService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "timeServiceClientBean")
@RequestScoped
public class TimeServiceClientBean {
    // Inject the EJB
   @EJB
   TimeService timeService;
    /**
     * Creates a new instance of TimeServiceClientBean
     */
    public TimeServiceClientBean() {
        
    }
    
    public String getCurrentTime(){
            System.out.println(timeService.getClass());
            return timeService.getTime();
        }
}