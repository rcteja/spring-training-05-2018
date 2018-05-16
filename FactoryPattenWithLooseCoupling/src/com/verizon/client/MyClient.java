/**
 * 
 */
package com.verizon.client;

import com.verizon.data.MyConnection;
import com.verizon.factory.DriverFactory;

/**
 * @author verizon
 *
 */
public class MyClient {

	public static void main(String[] args) {

		MyConnection conn = DriverFactory.getConnection("f");
		
		System.out.println(conn.getConnection());
		System.out.println(conn.getProductInfo());

	}

}
