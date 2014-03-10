package eu.ec.inea.ejb.providers;


import com.vaadin.addon.jpacontainer.provider.MutableLocalEntityProvider;
import eu.ec.inea.domain.core.AbstractJPAEntity;

import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by asvesdi on 10/03/14.
 */
@TransactionManagement
public abstract class EjbEntityProvider<T extends AbstractJPAEntity> extends MutableLocalEntityProvider<T>{


    @PersistenceContext
    private EntityManager em;

    protected EjbEntityProvider(Class<T> entityClass) {
        super(entityClass);
    }

    @PostConstruct
    public void init() {
        setTransactionsHandledByProvider(false);
        setEntityManager(em);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    protected void runInTransaction(Runnable operation) {
        super.runInTransaction(operation);
    }

    protected EjbEntityProvider(Class<T> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
    }
}
