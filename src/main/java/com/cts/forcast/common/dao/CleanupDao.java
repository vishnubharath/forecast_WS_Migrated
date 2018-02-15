package com.cts.forcast.common.dao;

import java.util.Map;

public interface CleanupDao<T> {

	void delete(Map<String, Object> parameters);

	void deleteAll();

}
