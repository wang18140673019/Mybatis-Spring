package com.hec.aurora.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aurora.mybatis.BaseUtil;
import com.hec.aurora.model.Country;
import com.hec.aurora.service.CountryService;
import com.hec.aurora.util.Springfactory;
import com.test.Persion;

import uncertain.composite.CompositeMap;

public class TestController extends BaseController<Country> {
private Country countryPara=new Country();
private CountryService countryService=null;
	public TestController() {
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public CompositeMap query(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		this.queryPrepare(map);
        //下面这部分是mybatis部分
	   List<Country> countryList = countryService.selectByCountry(this.countryPara, 1, 5);
	   BaseUtil.listToConsumer(countryList, getConsumer(), "records", "record");
		  CompositeMap queryData=new CompositeMap();
		    queryData.put("queryData",super.getConsumer());
		   // super.setConsumer(null);
		return queryData;
	}


	@Override
	public CompositeMap insert(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		super.getBeanFromMap(map, countryPara);
		System.out.println(countryPara);
		return null;
	}


	@Override
	public CompositeMap update(CompositeMap map) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CompositeMap delete(CompositeMap map) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CompositeMap execute(CompositeMap map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void queryPrepare(Map map){
		super.setAttributes(map);
		BaseUtil.initBean(this.countryPara,super.getMapParaData());
		countryService=Springfactory.getBean("countryService");
		if(countryService==null){
		   throw new NullPointerException("没有找到bean:countryService");
		}
	  
	}
	
	public static void main(String[] args) {
		
	}
}
