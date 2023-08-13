package aec.doh.redeem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "campaign_goods_qtys")
public class CampaignGoodsQty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "campaign_goods_qtys_id")
	private long id;
	
	@Column(name = "qty")
	private long qty;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}
	
	
}
