package com.apnahomeloan.app.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnahomeloan.app.model.EmiDetails;

public interface EmiDetailsRepository extends JpaRepository<EmiDetails, Integer>{



}
