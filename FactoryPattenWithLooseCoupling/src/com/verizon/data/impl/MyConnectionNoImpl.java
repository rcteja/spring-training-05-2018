package com.verizon.data.impl;

import com.verizon.data.MyConnection;

public class MyConnectionNoImpl implements MyConnection {

	@Override
	public String getConnection() {
		return "No String";
	}

	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "No Product";
	}

}
