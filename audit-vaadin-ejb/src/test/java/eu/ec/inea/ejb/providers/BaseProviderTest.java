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
        p.setProperty("auditDS", "new://Resource?type=DataSource");
        p.setProperty("auditDS.JdbcDriver", "org.h2.Driver");
        p.setProperty("auditDS.JdbcUrl", "jdbc:h2:mem:auditdb;LOCK_TIMEOUT=20000;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=TRUE");

        p.setProperty("audit-db-pu.hibernate.dialect", "org.hibernate.dialect.H2Dialect");



        ctx = EJBContainer.createEJBContainer(p).getContext();
    }


}
