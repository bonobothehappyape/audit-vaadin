package eu.ec.inea.domain;

import eu.ec.inea.domain.core.AbstractJPAEntity;

import javax.persistence.*;

@Entity
@Table(name= "V_PROJ_PAYMENTS")
public class PaymentView extends AbstractJPAEntity {

	@Column(name="AMOUNT")
	private Long amount;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
