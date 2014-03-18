package eu.ec.inea.ejb.providers;

import eu.ec.inea.domain.User;
import eu.ec.inea.ejb.providers.impl.UserEntityProvider;
import junit.framework.Assert;
import junit.framework.TestCase;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.HashMap;
import java.util.Properties;


/**
 * Created by asvesdi on 10/03/14.
 */
public class UserEntityProviderTest extends BaseProviderTest{



    public void test() throws Exception {
        UserEntityProvider provider = (UserEntityProvider) getCtx().lookup("java:global/audit-vaadin-ejb/UserEntityProvider");
        Assert.assertNotNull(provider);


        User u = new User();
        u.setFirstName("Dimitris");
        u.setLastName("Asvestis");
        u.setUserName("asvesdi");

        u = provider.updateEntity(u);

        Assert.assertNotNull(u.getId());
        Assert.assertEquals(u.getLastName(),"Asvestis");


    }


}
