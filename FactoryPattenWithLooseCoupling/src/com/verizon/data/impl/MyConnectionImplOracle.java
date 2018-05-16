/**
 * 
 */
package com.verizon.data.impl;

import com.verizon.data.MyConnection;

/**
 * @author verizon
 *
 */
public class MyConnectionImplOracle implements MyConnection{

	@Override
	public String getConnection() {		
		return "oracle DB Connected";
	}

	@Override
	public String getProductInfo() {
		return "oracle 11g";
	}

}
