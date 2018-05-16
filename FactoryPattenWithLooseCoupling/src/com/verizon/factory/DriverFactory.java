/**
 * 
 */
package com.verizon.factory;

import com.verizon.data.MyConnection;
import com.verizon.data.impl.MyConnectionImplMySql;
import com.verizon.data.impl.MyConnectionImplOracle;
import com.verizon.data.impl.MyConnectionNoImpl;

/**
 * @author verizon
 *
 */
public class DriverFactory {
	public static MyConnection getConnection(String dbname){
		if("oracle".equalsIgnoreCase(dbname)){
			return new MyConnectionImplOracle();
		}
		else if("MySql".equalsIgnoreCase(dbname)){
			return new MyConnectionImplMySql();
		}else{
			return new MyConnectionNoImpl();	
		}
						
	}

}
