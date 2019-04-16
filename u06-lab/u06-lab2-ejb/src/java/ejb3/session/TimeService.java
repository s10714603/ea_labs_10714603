package ejb3.session;

import javax.ejb.Remote;

/**
 * The remote view to provide time service methods
 * @author steven
 */
@Remote
public interface TimeService {
    public String getTime();
}