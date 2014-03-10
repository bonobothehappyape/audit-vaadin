package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntityAudit;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="USERS")
public class User extends AbstractJPAEntityAudit {

	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
    @ElementCollection
	@CollectionTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_PKID",referencedColumnName="pkid") )
	@Column(name = "ROLE_PKID", nullable = false)
	private Set<Long> roles = Collections.emptySet();


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Long> getRoles() {
        return roles;
    }

    public void setRoles(Set<Long> roles) {
        this.roles = roles;
    }
}
