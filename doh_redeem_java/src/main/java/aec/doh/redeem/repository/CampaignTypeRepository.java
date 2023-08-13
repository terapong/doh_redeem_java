package aec.doh.redeem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aec.doh.redeem.entity.*;

public interface CampaignTypeRepository extends JpaRepository<Campaign, Long> {

}
