package com.lending.money.repository;

import com.lending.money.entity.BorrowerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerInfoRepository extends JpaRepository<BorrowerInfo, Integer> {
}
