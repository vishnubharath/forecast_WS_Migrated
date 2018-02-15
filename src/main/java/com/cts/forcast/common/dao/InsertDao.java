package com.cts.forcast.common.dao;

import java.util.Collection;
import java.util.Map;

public interface InsertDao<T> {

	void insert(Collection<T> entity);

	int insert(T entity);
	
	void insertAll(Collection<T> entities);

	void insertFrom(Map<String, Object> parameters);
}
