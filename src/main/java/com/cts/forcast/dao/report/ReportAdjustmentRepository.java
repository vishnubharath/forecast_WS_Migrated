package com.cts.forcast.dao.report;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ReportAdjustmentRepository extends CrudRepository<ReportAdjustmentEntity, Long> {
	
}