package aec.doh.redeem.entity;

import java.sql.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "campaign")
public class Campaign {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "campaign_id")
	private long Id;
	
	@Column(name = "campaign_name")
	private String campaignName;
	
	@Column(name = "start_date")
	private Timestamp startDate;
	
	@Column(name = "end_date")
	private Timestamp endDate;
	
	@Column(name = "record_status")
	private boolean recordStatus;
	
	@Column(name = "create_user_id")
	private long createUserId;
	
	@Column(name = "create_dtm")
	private Timestamp createDtm;
	
	@Column(name = "create_timestamp")
	private Timestamp createTimestamp;
	
	@Column(name = "campaign_type")
	private int campaignType;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public boolean isRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(boolean recordStatus) {
		this.recordStatus = recordStatus;
	}
	public long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}
	public Timestamp getCreateDtm() {
		return createDtm;
	}
	public void setCreateDtm(Timestamp createDtm) {
		this.createDtm = createDtm;
	}
	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public int getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(int campaignType) {
		this.campaignType = campaignType;
	}
	
	
}
