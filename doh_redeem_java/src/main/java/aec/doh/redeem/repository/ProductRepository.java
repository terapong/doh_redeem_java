package aec.doh.redeem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aec.doh.redeem.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
