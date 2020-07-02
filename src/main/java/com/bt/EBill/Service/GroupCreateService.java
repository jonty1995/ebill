package com.bt.EBill.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.EBill.repo.impl.GroupCreateRepoImpl;

@Service
public class GroupCreateService {

	@Autowired
	private GroupCreateRepoImpl groupCreateRepoImpl;

	public List<Object[]> getMapping() {
		/*
		 * List<Object[]> arr = new ArrayList<Object[]>(); arr.add(new Object[] { "a",
		 * "b" });
		 * return arr;
		 */
		return groupCreateRepoImpl.getMappings();
		
	}

}
