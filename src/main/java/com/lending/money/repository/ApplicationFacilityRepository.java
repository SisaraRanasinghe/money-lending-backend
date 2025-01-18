package com.lending.money.repository;

import com.lending.money.entity.ApplicationFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationFacilityRepository extends JpaRepository<ApplicationFacility, Integer> {
}
