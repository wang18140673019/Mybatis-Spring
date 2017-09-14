package com.hec.aurora.model;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseDTO implements Serializable {

	public BaseDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		   ObjectMapper mapper = new ObjectMapper(); //转换器  
	          
	        //测试01：对象--json  
	        String json=null;
			try {
				json = mapper.writeValueAsString(this);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //将对象转换成json  
	         
		return json;
	}
	
}
