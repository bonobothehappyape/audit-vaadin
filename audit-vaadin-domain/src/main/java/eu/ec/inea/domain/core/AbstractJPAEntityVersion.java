package eu.ec.inea.domain.core;

import eu.ec.inea.domain.core.Identifiable;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractJPAEntityVersion extends AbstractJPAEntity{

    @Version
    @Column(name="VERSION")
    protected Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().concat(" [ID=" + id + "]");
    }
}
