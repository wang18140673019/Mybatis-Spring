package com.hec.aurora.controller;

import java.util.Map;

import com.hec.aurora.model.Country;
import com.hec.aurora.model.ExpReportHeaders;
import com.hec.aurora.service.CountryService;
import com.hec.aurora.service.ExpReportHeadersService;
import com.hec.aurora.util.Springfactory;

import uncertain.composite.CompositeMap;

public class ExpReportHeadersController extends BaseController<ExpReportHeaders> {
	private ExpReportHeaders expReportHeaders=new ExpReportHeaders();
	private ExpReportHeadersService expReportHeadersService=null;
	public ExpReportHeadersController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompositeMap insert(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		 this.beforeRun(map);
		expReportHeadersService.insertSelective(expReportHeaders);
		CompositeMap currentParameter=(CompositeMap)map.get("currentParameter");
		currentParameter.put("exp_report_header_id",expReportHeaders.getExp_report_header_id());
		return null;
	}

	@Override
	public CompositeMap update(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		this.beforeRun(map);
		expReportHeadersService.updateNotNull(this.expReportHeaders);
		return null;
	}

	@Override
	public CompositeMap delete(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		this.beforeRun(map);
		expReportHeadersService.delete(this.expReportHeaders);
		return null;
	}

	@Override
	public CompositeMap execute(CompositeMap Amap) {
		// TODO Auto-generated method stub
		Map map=(Map) Amap.get("allMap");
		return null;
	}
	
	
	public void beforeRun(Map map){
		expReportHeaders=super.getBeanFromMap(map, expReportHeaders);
		System.out.println("实体类expReportHeaders属性值json输出： "+expReportHeaders);
		expReportHeadersService=Springfactory.getBean("expReportHeadersService");
		if(expReportHeadersService==null){
			   throw new NullPointerException("没有找到bean:expReportHeadersService");
			}
		
	}
	@Override
	public CompositeMap query(CompositeMap Amap) {
		// TODO Auto-generated method stub
		return super.query(Amap);
	}

}
