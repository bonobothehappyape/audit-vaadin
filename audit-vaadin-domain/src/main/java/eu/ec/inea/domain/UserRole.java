package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntityVersion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class UserRole extends AbstractJPAEntityVersion {
            
	@Column(name="ROLE")
    String role;
	
	@Column(name="ROLE_DESC")
    String roleDescription;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
