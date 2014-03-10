package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntity;
import eu.ec.inea.domain.core.AbstractJPAEntityAudit;

import javax.persistence.*;

@Entity
@Table(name= "V_AUDITS")
@AttributeOverride(name = "id",
        column = @Column(name = "AUDIT_PKID", insertable = false, updatable = false))
public class AuditView extends AbstractJPAEntity {

	@Column(name="AUDITNO")
	private String auditNumber;
	
	@Column(name="YEAR")
	private Integer year;
	
	@Column(name="ABAC_KEY")
	private String abacKey;
	
	@Column(name="RECIPIENT_NAME")
	private String reciepientName;
	
	@Column(name="RECIPIENT_COUNTRY")
	private String reciepientCountry;
	
	@Column(name="IMPL_NAME")
	private String implementorName;
	
	@Column(name="IMPL_COUNTRY")
	private String implementorCountry;
	
	@Column(name="RECOMMENDATION")
	private String recommendation;
	
	public AuditView() {
		super();
	}

    public String getAuditNumber() {
        return auditNumber;
    }

    public void setAuditNumber(String auditNumber) {
        this.auditNumber = auditNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAbacKey() {
        return abacKey;
    }

    public void setAbacKey(String abacKey) {
        this.abacKey = abacKey;
    }

    public String getReciepientName() {
        return reciepientName;
    }

    public void setReciepientName(String reciepientName) {
        this.reciepientName = reciepientName;
    }

    public String getReciepientCountry() {
        return reciepientCountry;
    }

    public void setReciepientCountry(String reciepientCountry) {
        this.reciepientCountry = reciepientCountry;
    }

    public String getImplementorName() {
        return implementorName;
    }

    public void setImplementorName(String implementorName) {
        this.implementorName = implementorName;
    }

    public String getImplementorCountry() {
        return implementorCountry;
    }

    public void setImplementorCountry(String implementorCountry) {
        this.implementorCountry = implementorCountry;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}
