package com.huihui.jdbc.test;

import java.util.ArrayList;
import java.util.List;

import com.huihui.jdbc.dao.EmployeesDao;
import com.huihui.jdbc.entity.Employees;

public class DBManagerTest {
	public static void main(String[] args) {
		List<Integer> ordersIds=new ArrayList<Integer>();
		ordersIds.add(1);
		ordersIds.add(101);
		ordersIds.add(102);
		ordersIds.add(103);
		List<Employees> list=EmployeesDao.instance.getEmployees(ordersIds);
		System.out.println(list.size());
		System.out.println(list.get(0).getFirst());
	}
}
