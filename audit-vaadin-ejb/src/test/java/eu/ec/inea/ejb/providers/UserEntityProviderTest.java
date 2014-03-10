package eu.ec.inea.ejb.providers;

import eu.ec.inea.domain.User;
import eu.ec.inea.ejb.providers.impl.UserEntityProvider;
import junit.framework.TestCase;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.HashMap;
import java.util.Properties;


/**
 * Created by asvesdi on 10/03/14.
 */
public class UserEntityProviderTest extends TestCase{

    public void test() throws Exception {
        final Properties p = new Properties();
//        p.setProperty("movieDatabase", "new://Resource?type=DataSource");
//        p.setProperty("movieDatabase.JdbcDriver", "org.hsqldb.jdbcDriver");
//        p.setProperty("movieDatabase.JdbcUrl", "jdbc:hsqldb:mem:moviedb");


        final Context context = EJBContainer.createEJBContainer(p).getContext();
        UserEntityProvider provider = (UserEntityProvider) context.lookup("java:global/audit-vaadin-ejb/UserEntityProvider");

        User u = new User();
        u.setFirstName("Dimitris");
        u.setLastName("Asvestis");


    }


}
