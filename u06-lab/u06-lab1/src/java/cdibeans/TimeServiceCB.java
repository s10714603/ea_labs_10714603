package cdibeans;

import ejb.TimeServiceEJB;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "timeServiceCB")
@RequestScoped
public class TimeServiceCB {
    
    @EJB
    TimeServiceEJB timeServiceEJB;
    /**
     * Creates a new instance of TimeServiceCB
     */
    public TimeServiceCB() {
    }
    
    public String getCurrentTime(){
        return timeServiceEJB.getTime();
    }
}