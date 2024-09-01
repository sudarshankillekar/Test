package com.qa.util;

import java.util.List;

import com.ui.pojo.GlobalDetailsPojo;

public class TestUtility {

	public static List<GlobalDetailsPojo> searchDataInList(List<GlobalDetailsPojo> dataList,String key) {
		 List<GlobalDetailsPojo> resultList =	dataList.stream().filter(new JobFilter(key)).toList();
		 return resultList;
	}
	
}
