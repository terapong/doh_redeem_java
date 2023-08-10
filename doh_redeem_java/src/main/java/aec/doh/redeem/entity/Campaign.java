package aec.doh.redeem.entity;

import java.sql.Timestamp;
import jakarta.persistence.*;

public class Campaign {
	private long Id;
	private String campaignName;
	private Timestamp startDate;
	private Timestamp endDate;
	private boolean recordStatus;
	private long createUserId;
	private Timestamp createDtm;
	private Timestamp createTimestamp;
	private int campaignType;
}
