package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntityVersion;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="AUDIT")
@AttributeOverride(name = "id",
		column = @Column(name = "AUDIT_PKID", insertable = false, updatable = false))

public class Audit extends AbstractJPAEntityVersion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="YEAR")
	private Integer year;
	
	@Column(name="AUDITNO")
	private String auditNumber;
	
	@Column(name="AUDITOR")
	private String auditor;


	@Column(name="ABAC_KEY")
	private String abacKey;
	
	@Column(name="REPORTED_AMOUNT")
	private BigDecimal reportedAmount;
	
	@Column(name="ACCEPTED_AMOUNT")
	private BigDecimal accAmount;
	
	@Column(name="ELIGIBLE_AMOUNT")
	private BigDecimal eligibleAmount;
	
	@Column(name="ADJUSTMENT")
	private BigDecimal adjustment;
	
	@Column(name="REASONS")
	private String reasons;
	
	@Column(name="RECOMMENDATION")
	private String recommendation;
	
	@Column(name="REMARKS")
	private String remarks;
	
	@Column(name="ARES_TO")
	private String aresTo;
	
	@Column(name="TO_DATE")
	private Date todate;
	
	@Column(name="DEADLINE")
	private Date deadline;
	
	@Column(name="ARES_FROM")
	private String aresFrom;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="DATE_IMPL")
	private Date implDate;
	
	@Column(name="DATE_RO")
	private Date roDate;
	
	@Column(name="RO_AMOUINT")
	private Float roAmount;
	
	@Column(name="AASC")
	private String aasc;
	
	@Column(name="FIELDWORK")
	private Date filedworkDate;
	
	@Column(name="DRAFT")
	private Date draftDate;
	
	@Column(name="FREPORT")
	private Date freportDate;
	
	@Column(name="FSHEET")
	private Date fsheetDate;

	@Column(name="FSHEET_REPLY")
	private Date fsheetReplyDate;
	
	@Column(name="FSHEET_IMPLEMENT")
	private Date fsheetImplDate;

	@Column(name = "RECIPIENT_ID")
	private Long recipientIDs;
	
	@Column(name = "IMPLEMNETING_ID")
	private Long implementingIDs;

	@Column(name="PAYMENT_ID")
	private Long paymentID;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuditNumber() {
        return auditNumber;
    }

    public void setAuditNumber(String auditNumber) {
        this.auditNumber = auditNumber;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAbacKey() {
        return abacKey;
    }

    public void setAbacKey(String abacKey) {
        this.abacKey = abacKey;
    }

    public BigDecimal getReportedAmount() {
        return reportedAmount;
    }

    public void setReportedAmount(BigDecimal reportedAmount) {
        this.reportedAmount = reportedAmount;
    }

    public BigDecimal getAccAmount() {
        return accAmount;
    }

    public void setAccAmount(BigDecimal accAmount) {
        this.accAmount = accAmount;
    }

    public BigDecimal getEligibleAmount() {
        return eligibleAmount;
    }

    public void setEligibleAmount(BigDecimal eligibleAmount) {
        this.eligibleAmount = eligibleAmount;
    }

    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAresTo() {
        return aresTo;
    }

    public void setAresTo(String aresTo) {
        this.aresTo = aresTo;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getAresFrom() {
        return aresFrom;
    }

    public void setAresFrom(String aresFrom) {
        this.aresFrom = aresFrom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getImplDate() {
        return implDate;
    }

    public void setImplDate(Date implDate) {
        this.implDate = implDate;
    }

    public Date getRoDate() {
        return roDate;
    }

    public void setRoDate(Date roDate) {
        this.roDate = roDate;
    }

    public Float getRoAmount() {
        return roAmount;
    }

    public void setRoAmount(Float roAmount) {
        this.roAmount = roAmount;
    }

    public String getAasc() {
        return aasc;
    }

    public void setAasc(String aasc) {
        this.aasc = aasc;
    }

    public Date getFiledworkDate() {
        return filedworkDate;
    }

    public void setFiledworkDate(Date filedworkDate) {
        this.filedworkDate = filedworkDate;
    }

    public Date getDraftDate() {
        return draftDate;
    }

    public void setDraftDate(Date draftDate) {
        this.draftDate = draftDate;
    }

    public Date getFreportDate() {
        return freportDate;
    }

    public void setFreportDate(Date freportDate) {
        this.freportDate = freportDate;
    }

    public Date getFsheetDate() {
        return fsheetDate;
    }

    public void setFsheetDate(Date fsheetDate) {
        this.fsheetDate = fsheetDate;
    }

    public Date getFsheetReplyDate() {
        return fsheetReplyDate;
    }

    public void setFsheetReplyDate(Date fsheetReplyDate) {
        this.fsheetReplyDate = fsheetReplyDate;
    }

    public Date getFsheetImplDate() {
        return fsheetImplDate;
    }

    public void setFsheetImplDate(Date fsheetImplDate) {
        this.fsheetImplDate = fsheetImplDate;
    }

    public Long getRecipientIDs() {
        return recipientIDs;
    }

    public void setRecipientIDs(Long recipientIDs) {
        this.recipientIDs = recipientIDs;
    }

    public Long getImplementingIDs() {
        return implementingIDs;
    }

    public void setImplementingIDs(Long implementingIDs) {
        this.implementingIDs = implementingIDs;
    }

    public Long getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Long paymentID) {
        this.paymentID = paymentID;
    }
}
