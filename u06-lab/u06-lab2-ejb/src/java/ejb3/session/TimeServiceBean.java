/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb3.session;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.ejb.Stateless;

/**
 *
 * @author Chipan
 */
public class TimeServiceBean implements TimeService{
    
    @Override
    public String getTime() {
        LocalDateTime current = LocalDateTime.now(); // get the current date
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dataTimeStr = current.format(df);
        return dataTimeStr;
    }
    
}
