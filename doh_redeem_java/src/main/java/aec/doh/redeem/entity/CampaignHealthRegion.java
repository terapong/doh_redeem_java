package aec.doh.redeem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "campaign_health_region")
public class CampaignHealthRegion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "campaign_health_region_id")
	private long id;
	
	@Column(name = "campaign_health_region_name")
	private String campaignHealthRegionName;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "region_id")
	private List<CampaignGoodsQty> CampaignGoodsQty = new ArrayList<>();

	public List<CampaignGoodsQty> getCampaignGoodsQty() {
		return CampaignGoodsQty;
	}

	public void setCampaignGoodsQty(List<CampaignGoodsQty> campaignGoodsQty) {
		CampaignGoodsQty = campaignGoodsQty;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCampaignHealthRegionName() {
		return campaignHealthRegionName;
	}

	public void setCampaignHealthRegionName(String campaignHealthRegionName) {
		this.campaignHealthRegionName = campaignHealthRegionName;
	}
	
	
}
