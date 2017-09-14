package com.hec.aurora.controller;
import com.hec.aurora.controller.BaseController;
import com.hec.aurora.model.ExpReportHeaders;
import com.hec.aurora.model.ExpReportLines;
import com.hec.aurora.service.ExpReportHeadersService;
import com.hec.aurora.service.ExpReportLinesService;
import com.hec.aurora.util.Springfactory;

import uncertain.composite.CompositeMap;

public class ExpReportLinesController extends BaseController<ExpReportLines> {
	private ExpReportLines expReportLines=new ExpReportLines();
	private ExpReportLinesService expReportLinesService=null;

	@Override
	public CompositeMap insert(CompositeMap map) {
		// TODO Auto-generated method stub
		this.beforeRun(map);
		CompositeMap currentParameter=(CompositeMap)map.get("currentParameter");
		Object expReportHeaderId=currentParameter.getObject("../../@exp_report_header_id");
		//expReportLines.setExpReportHeaderId(expReportHeaderId);
		expReportLinesService.insertSelective(expReportLines);
		
		return null;
	}

	@Override
	public CompositeMap update(CompositeMap map) {
		// TODO Auto-generated method stub
		this.beforeRun(map);
		expReportLinesService.updateNotNull(expReportLines);
		return null;
	}

	@Override
	public CompositeMap delete(CompositeMap map) {
		// TODO Auto-generated method stub
		this.beforeRun(map);
		expReportLinesService.delete(expReportLines);
		return null;
	}

	@Override
	public CompositeMap execute(CompositeMap map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void beforeRun(CompositeMap map) {
		expReportLines = super.getBeanFromMap(map, expReportLines);
		System.out.println("实体类expReportLines属性值json输出： " + expReportLines);
		expReportLinesService = Springfactory.getBean("expReportLinesService");
		if (expReportLinesService == null) {
			throw new NullPointerException("没有找到bean:expReportLinesService");
		}

	}

}
