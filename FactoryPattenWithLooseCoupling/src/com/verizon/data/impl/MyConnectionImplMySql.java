/**
 * 
 */
package com.verizon.data.impl;

import com.verizon.data.MyConnection;

/**
 * @author verizon
 *
 */
public class MyConnectionImplMySql implements MyConnection{

	@Override
	public String getConnection() {		
		return "MYSQL DB Connected";
	}

	@Override
	public String getProductInfo() {
		return "MYSQL ";
	}

}
