package com.bt.EBill.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class GroupModel {
	private String group_id,group_description,start_date, end_date;
}
