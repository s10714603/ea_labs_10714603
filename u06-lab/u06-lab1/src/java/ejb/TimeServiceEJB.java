/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Chipan
 */
@Stateless
@LocalBean
public class TimeServiceEJB {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String getTime() {
//        Java SE 7
//        Formatter fmt = new Formatter();
//        Calendar cal = Calendar.getInstance();
//        fmt.format("%tr", cal);
        
        // New DateTime API in Java SE 8
        LocalDateTime current = LocalDateTime.now(); // get the current date
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dataTimeStr = current.format(df);
        return dataTimeStr;
    }
    
}
