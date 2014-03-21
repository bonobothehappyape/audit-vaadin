package eu.ec.inea.ejb.providers;

import eu.ec.inea.ejb.providers.impl.UserEntityProvider;
import junit.framework.TestCase;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.Properties;

/**
 * Created by dimitris on 18/03/14.
 */
public class BaseProviderTest extends TestCase {

    public Context getCtx() {
        return ctx;
    }

    private Context ctx;

    @Override
    protected void setUp() throws Exception {
        final Properties p = new Properties();
        p.put("auditDS", "new://Resource?type=DataSource");
        p.put("auditDS.JdbcDriver", "org.hsqldb.jdbcDriver");
        p.put("auditDS.JdbcUrl", "jdbc:hsqldb:mem:test");


        ctx = EJBContainer.createEJBContainer(p).getContext();
    }


}
