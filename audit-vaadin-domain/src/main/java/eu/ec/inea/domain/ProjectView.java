package eu.ec.inea.domain;


import eu.ec.inea.domain.core.AbstractJPAEntity;
import eu.ec.inea.domain.core.AbstractJPAEntityVersion;

import javax.persistence.*;

@Entity
@Table(name= "V_PROJECT")
@AttributeOverride(name = "id",
        column = @Column(name = "PROJECT_PKID", insertable = false, updatable = false))
public class ProjectView extends AbstractJPAEntity {
	

	@Column(name = "TITLE")
	private String decisionTitle;

	@Column(name = "PROJECT_CODE")
	private String projectCode;

	
	@Column(name = "PM_USER_ID")
	private Long projectManagerPkid;
	
	@Column(name = "PM_NAME")
	private String projectManagerName;
	
	@Column(name = "SPM_USER_ID")
	private Long seniorProjectManagerPkid;
	
	@Column(name = "SPM_NAME")
	private String seniorProjectManagerName;
	
	@Column(name = "BPM_USER_ID")
	private Long backupProjectManagerPkid;
	
	@Column(name = "BPM_NAME")
	private String backupProjectManagerName;
	
	@Column(name = "FO_USER_ID")
	private Long financialOfficerPkid;
	
	@Column(name = "FO_NAME")
	private String financialOfficerName;
	
	@Column(name = "TENTEC_UNIT_PKID")
	private Long unitPkid;
	
	@Column(name = "UNIT")
	private String unitName;
	
	@Column(name="PROJ_STATUS_PKID")
	private Long statusPkid;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name="COMMITMENTS")
	private String commitments;


	/**
	 * Default Constructor
	 */
	public ProjectView() {
		super();
	}
	
	



	
	
}
