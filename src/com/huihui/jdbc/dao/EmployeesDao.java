package com.huihui.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.huihui.jdbc.DbManager;
import com.huihui.jdbc.entity.Employees;

public class EmployeesDao {
	private static final String SELECT_ORDERS = "SELECT `id`,`age`,`first`,`last` from Employees where id in ($$$)";
	public static final EmployeesDao instance = new EmployeesDao();

    private EmployeesDao() {

    }
	public static List<Employees> getEmployees(List<Integer> orderIds)  {
		if (null == orderIds || orderIds.isEmpty()) {
            return new ArrayList<Employees>();
        }
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
				conn = DbManager.getInstnace().getConnection();
	            StringBuilder sb = new StringBuilder();
	            for (int i = orderIds.size() - 1; i >= 0; i--) {
	                sb.append('?');
	                if (i > 0) {
	                    sb.append(',');
	                }
	            }
	            String sql = SELECT_ORDERS.replace("$$$", sb.toString());
	            stmt = conn.prepareStatement(sql);
	            for (int i = 1; i <= orderIds.size(); i++) {
	                stmt.setInt(i, orderIds.get(i - 1));
	            }

	            rs = stmt.executeQuery();
	            List<Employees> orders = new ArrayList<Employees>();
	            while (rs.next()) {
	            	Employees order = Employees.builder.build(rs);
	                orders.add(order);
	            }
	            return orders;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
