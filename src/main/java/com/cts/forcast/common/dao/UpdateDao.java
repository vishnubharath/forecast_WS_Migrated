package com.cts.forcast.common.dao;

import java.util.Collection;
import java.util.Map;

public interface UpdateDao<T> {

	void update(T entity);

	void updateAll(Collection<T> entities);

	void update(Map<String, Object> parameters);
}
