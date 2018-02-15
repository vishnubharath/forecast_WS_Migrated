package com.cts.forcast.dao.upload;

//import org.apache.ibatis.annotations.Param;

import com.cts.forcast.common.dao.InsertDao;
import com.cts.forcast.domain.leave.LeaveVO;

public interface UploadDao extends InsertDao<LeaveVO> {
 
	//void insertLeave(@Param("Leave_ID") String Leave_ID, @Param("month") String month, @Param("No_Days")  String No_Days);
}
