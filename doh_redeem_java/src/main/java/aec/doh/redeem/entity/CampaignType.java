package aec.doh.redeem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "campaign_type")
public class CampaignType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "campaign_type_id")
	private long id;
	
	@Column(name = "campaign_type_name")
	private String campaignTypeName;
	
	@Column(name = "record_status")
	private long recordStatus;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "campaign_type")
	private List<Campaign> campaigns = new ArrayList<>();
	
	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getCampaignTypeName() {
		return campaignTypeName;
	}

	public void setCampaignTypeName(String campaignTypeName) {
		this.campaignTypeName = campaignTypeName;
	}

	public long getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(long recordStatus) {
		this.recordStatus = recordStatus;
	}
}
