package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	private static Connection conn;
	private static PreparedStatement getAllProductsStatement;

	static {
		try {
			conn = DBUtil.getConnection();
			getAllProductsStatement = conn.prepareStatement("select * from product");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<>();
		try {
			ResultSet rs = getAllProductsStatement.executeQuery();
			while (rs.next()) {
				productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
						rs.getDate(5).toLocalDate(), rs.getInt(6)));
			}
			if(productList.size() > 0)
				return productList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
