package com.hec.aurora.util;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class mybatisUtil {

	public mybatisUtil() {
		// TODO Auto-generated constructor stub
	}
	
	//hashMap转实体类实例
	  
    public static <T> T initBean(Map beanMap,T t){
    	  ObjectMapper mapper = new ObjectMapper(); //转换器  
    	String jsonStr = null;
		try {
			jsonStr = mapper.writeValueAsString(beanMap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //map转json  
        //  System.out.println(jsonStr); //与之前格式完全相同，说明经过map转换后，信息没有丢失
          try {
			t=(T) mapper.readValue(jsonStr, t.getClass());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //json转java对象。经测，转成对象后，一切恢复正常  
    	       return t;
    	
    } 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
