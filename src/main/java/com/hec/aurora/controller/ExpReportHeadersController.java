package com.hec.aurora.controller;

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
	public CompositeMap insert(CompositeMap map) {
		// TODO Auto-generated method stub
		 this.beforeRun(map);
		expReportHeadersService.insertSelective(expReportHeaders);
		CompositeMap currentParameter=(CompositeMap)map.get("currentParameter");
		currentParameter.put("exp_report_header_id",expReportHeaders.getExpReportHeaderId());
		return null;
	}

	@Override
	public CompositeMap update(CompositeMap map) {
		// TODO Auto-generated method stub
		this.beforeRun(map);
		expReportHeadersService.updateNotNull(this.expReportHeaders);
		return null;
	}

	@Override
	public CompositeMap delete(CompositeMap map) {
		// TODO Auto-generated method stub
		this.beforeRun(map);
		expReportHeadersService.delete(this.expReportHeaders);
		return null;
	}

	@Override
	public CompositeMap execute(CompositeMap map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void beforeRun(CompositeMap map){
		expReportHeaders=super.getBeanFromMap(map, expReportHeaders);
		System.out.println("实体类expReportHeaders属性值json输出： "+expReportHeaders);
		expReportHeadersService=Springfactory.getBean("expReportHeadersService");
		if(expReportHeadersService==null){
			   throw new NullPointerException("没有找到bean:expReportHeadersService");
			}
		
	}

}
