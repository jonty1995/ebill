package com.bt.EBill.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.EBill.Common.GenericFunction;
import com.bt.EBill.Model.GroupModel;
import com.bt.EBill.repo.impl.GroupCreateRepoImpl;


@Service
public class GroupCreateService {

	@Autowired
	private GroupCreateRepoImpl groupCreateRepoImpl;
	@Autowired
	private GroupModel groupModel;

	public List<GroupModel> getMapping() {
		List<GroupModel> lst = new ArrayList<GroupModel>();
		for (Object[] row : groupCreateRepoImpl.getMappings()) {
			groupModel.setGroup_id(row[0].toString());
			groupModel.setGroup_description(row[1].toString());
			groupModel.setStart_date(GenericFunction.convertToUIDateV1(row[2]));
			groupModel.setEnd_date(GenericFunction.convertToUIDateV1(row[3]));
		}
		return lst;
	}

}
