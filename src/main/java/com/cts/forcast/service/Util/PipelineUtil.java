package com.cts.forcast.service.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



import com.cts.forcast.domain.pipeline.StaffingForUIVO;
import com.cts.forcast.domain.pipeline.StaffingPipelineVO;

public class PipelineUtil {

	@SuppressWarnings("rawtypes")
	public static String[] getKeySet(Map<String, Double> map) {
		String[] keySet = new String[map.size()];
		Set<String> keys = map.keySet();
		Iterator itr = keys.iterator();
		int i = 0;
		while (itr.hasNext()) {
			keySet[i] = "" + itr.next();
			i++;
		}
		return keySet;
	}
	
	public static Double[] getValueSet(Map<String, Double> map) {
		Double[] valueSet = new Double[map.size()];
		Set<String> keys = map.keySet();
		int i = 0;
		for (String key : keys) {
			valueSet[i] = map.get(key);
			i++;
		}
		return valueSet;
	}
	
	public static List<StaffingPipelineVO> convertStaffingPipelineVO(List<StaffingForUIVO> staffingUIVOList){
		List<StaffingPipelineVO> staffingPipelineVOs = new ArrayList<StaffingPipelineVO>();
		for(StaffingForUIVO uiVO:staffingUIVOList){
			StaffingPipelineVO staffingVO = new StaffingPipelineVO();
			staffingVO.setsNo(uiVO.getsNo());
			staffingVO.setName(uiVO.getName());			
			staffingVO.setDivision(uiVO.getDivision());
			staffingVO.setNoOfResources(uiVO.getNoOfResources());
			String[] headers = uiVO.getHeaders();
			Double[] values = uiVO.getValues();
			Map<String,Double> amountsMap = new HashMap<String,Double>();
			for(int i=0;i<headers.length;i++){
				String month = headers[i];
				Double amount = values[i];
				amountsMap.put(month, amount);
			}
			double amount = 0.0;
			for (Double value : values) {
				amount += value;
			}
			staffingVO.setAmount(amount);			
			staffingVO.setCostData(amountsMap);
			staffingPipelineVOs.add(staffingVO);
		}
		
		return staffingPipelineVOs;
		
	}
	
	public static Double getTotalStaffingAmount(List<StaffingPipelineVO> staffingVOList){
		Double totalAmount = 0.0;
		
		for(StaffingPipelineVO staffingVO:staffingVOList){
			totalAmount += staffingVO.getAmount();
		}
		
		return totalAmount;
	}
}
