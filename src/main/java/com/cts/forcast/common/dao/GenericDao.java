package com.cts.forcast.common.dao;

import java.util.Collection;

//import org.apache.ibatis.annotations.Param;

public interface GenericDao<T>/* extends InsertDao<T>, UpdateDao<T>*/ {

	//T get(@Param("id") Integer id);

	//Collection<T> get(@Param("map") Map<String, Object> parameters);

	Collection<T> getAll();
}
