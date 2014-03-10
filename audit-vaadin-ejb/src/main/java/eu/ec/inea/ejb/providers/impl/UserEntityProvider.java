package eu.ec.inea.ejb.providers.impl;

import eu.ec.inea.domain.User;
import eu.ec.inea.ejb.providers.EjbEntityProvider;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * Created by asvesdi on 10/03/14.
 */
@Stateless
public class UserEntityProvider extends EjbEntityProvider<User>{

    public UserEntityProvider() {
        super(User.class);
    }
}
