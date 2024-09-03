package com.qa.util;
import com.google.gson.Gson;
import java.util.List;

import com.ui.pojo.GlobalDetailsPojo;

public class TestUtility {

	public static List<GlobalDetailsPojo> searchDataInList(List<GlobalDetailsPojo> dataList,String key) {
		 List<GlobalDetailsPojo> resultList =	dataList.stream().filter(new JobFilter(key)).toList();
		 return resultList;
	}
	
	public static String convertPOJOToJSON(Object data) {
		Gson gson = new Gson();
		String result = gson.toJson(data);
		return result;
	}
	
}
