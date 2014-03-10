package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntityVersion;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LEGAL_ENTITY")
@AttributeOverride(name = "id",
		column = @Column(name = "LEGAL_PKID", insertable = false, updatable = false))
public class LegalEnity extends AbstractJPAEntityVersion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="COUNTRY_CODE")
	private String country_code;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_code() {
		return country_code;
	}

}
