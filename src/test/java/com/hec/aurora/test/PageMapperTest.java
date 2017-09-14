/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.hec.aurora.test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hec.aurora.mapper.CountryMapper;
import com.hec.aurora.model.Country;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by liuzh on 2015/3/7.
 */
public class PageMapperTest extends BasicTest {

//    @Autowired
//    private CountryMapper countryMapper;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void test(){
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Example example = new Example(Country.class);
        example.createCriteria().andGreaterThan("id",100);
        PageHelper.startPage(2,10);
        List<Country> countries = countryMapper.selectByExample(example);
        PageInfo<Country> pageInfo = new PageInfo<Country>(countries);
        System.out.println(pageInfo.getTotal());

        countries = countryMapper.selectByExample(example);
        pageInfo = new PageInfo<Country>(countries);
        System.out.println(pageInfo.getTotal());
        
        
       
		  
    }
    
    
    @Test
    public void  insertBean(){
    	   CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            Map<String,Object> countryMap=new HashMap<String,Object>();
             countryMap.put("countryname", "天朝");
             countryMap.put("countrycode", "BBB");
             Country country=new Country();
             country=PageMapperTest.initBean(countryMap, country);
             countryMapper.insertSelective(country);
             
          
    }
    
    public static <T> T initBean(Map beanMap,T t){
    	  ObjectMapper mapper = new ObjectMapper(); //转换器  
    	String jsonStr = null;
		try {
			jsonStr = mapper.writeValueAsString(beanMap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //map转json  
          System.out.println(jsonStr); //与之前格式完全相同，说明经过map转换后，信息没有丢失
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
    /*
     * 测试事物执行过程
     */
    @Test
    @Transactional
    public void insertTranscation(){
    	  CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
          Map<String,Object> countryMap=new HashMap<String,Object>();
           countryMap.put("countryname","单独开发进度");
           countryMap.put("countrycode","BBB");
           Country country=new Country();
           country=PageMapperTest.initBean(countryMap, country);
           countryMapper.insertSelective(country);
           //sqlSession.commit();
          // country.setCountryname(null);
           //country.setId(null);
           //countryMapper.insertSelective(country);
          
    }
    
}
