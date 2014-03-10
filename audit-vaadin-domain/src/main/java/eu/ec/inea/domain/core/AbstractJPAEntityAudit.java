package eu.ec.inea.domain.core;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public class AbstractJPAEntityAudit extends AbstractJPAEntityVersion {

	@Column(name="LAST_UPDATED_BY")
	protected String updatedBy;
	
	@Column(name="LAST_UPDATED_DATE")
	protected Date updatedDate;


    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @PreUpdate
    public void setChangeDate() {
        this.updatedDate = Calendar.getInstance().getTime();
    }
}
