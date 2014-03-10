package eu.ec.inea.domain.core;

import java.io.Serializable;

/**
 * Created by asvesdi on 06/03/14.
 */
public interface Identifiable<T extends Serializable> extends Serializable {

    T getId( );


    void setId(T id );

}
