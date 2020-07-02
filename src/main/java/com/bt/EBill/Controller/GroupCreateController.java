package com.bt.EBill.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.EBill.Model.GroupModel;
import com.bt.EBill.Service.GroupCreateService;

@RestController
@RequestMapping("/api")
public class GroupCreateController {
	@Autowired
	private GroupCreateService groupCreateService;

	@GetMapping("/grp")
	public List<GroupModel> getMapping() {
		return groupCreateService.getMapping();
	}
}
