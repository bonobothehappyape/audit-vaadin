package eu.ec.inea.domain.core;

import javax.persistence.*;

/**
 * Created by asvesdi on 06/03/14.
 */
@MappedSuperclass
@SequenceGenerator(name="AUDIT_SEQ", sequenceName="AUDIT_SEQ", allocationSize=100)
public class AbstractJPAEntity implements Identifiable<Long>  {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "AUDIT_SEQ")
    @Column(name="PKID", nullable = false )
    protected Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
