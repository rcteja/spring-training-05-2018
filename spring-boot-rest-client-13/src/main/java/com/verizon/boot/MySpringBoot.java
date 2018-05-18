/**
 * 
 */
package com.verizon.boot;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author verizon
 *
 */
public class MySpringBoot {

	public static void main(String[] args) {
	
		String userDetails="bill:abc123";
		String encodeValues = new String(Base64.encodeBase64(userDetails.getBytes()));
		RestTemplate rt = new RestTemplate();
		HttpHeaders hd = new HttpHeaders();
		hd.set("Accept", "application/json");
		hd.set("Authorization", "Basic "+encodeValues);
		HttpEntity he = new HttpEntity<>(hd);
		ResponseEntity<String> resp =  rt.exchange("http://localhost:8181/app/find?empid=100", HttpMethod.GET, he, String.class);
		System.out.println(resp.getBody());
	}
	
	
}
