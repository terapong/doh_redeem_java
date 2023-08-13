package aec.doh.redeem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "campaign_goods")
public class CampaignGoods {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goods_id")
	private long id;
	
	@Column(name = "goods_name")
	private String goodsName;
		
	@Column(name = "record_status")
	private int recordStatus;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "good_id")
	private List<CampaignGoodsQty> CampaignGoodsQty = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public List<CampaignGoodsQty> getCampaignGoodsQty() {
		return CampaignGoodsQty;
	}

	public void setCampaignGoodsQty(List<CampaignGoodsQty> campaignGoodsQty) {
		CampaignGoodsQty = campaignGoodsQty;
	}
	
	
}
