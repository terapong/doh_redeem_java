package aec.doh.redeem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aec.doh.redeem.entity.Campaign;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

}
