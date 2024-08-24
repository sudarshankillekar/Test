package com.qa.util;

import com.google.common.base.Predicate;
import com.ui.pojo.GlobalDetailsPojo;

public class JobFilter implements java.util.function.Predicate<GlobalDetailsPojo> {

	private String jobNumber;
	
	
	public JobFilter(String jobNumber) {
		super();
		this.jobNumber = jobNumber;
	}


	@Override
	public boolean test(GlobalDetailsPojo t) {
		if(t.getJobNumber().equalsIgnoreCase(jobNumber)){
			return true;
		}else {
			return false;
		}
	}

	
}
