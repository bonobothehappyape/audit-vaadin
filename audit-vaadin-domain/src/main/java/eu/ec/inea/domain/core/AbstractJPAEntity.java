package eu.ec.inea.domain.core;

import javax.persistence.*;

/**
 * Created by asvesdi on 06/03/14.
 */
@MappedSuperclass
public class AbstractJPAEntity implements Identifiable<Long>  {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="audit_seq")
    @SequenceGenerator(name="audit_seq", sequenceName="audit_seq", allocationSize=100)
    @Column(name = "pkid", nullable = false)
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
