package com.hec.aurora.controller;

import java.util.Map;

import com.aurora.mybatis.BaseUtil;
import com.hec.aurora.controller.IController;
import com.hec.aurora.util.mybatisUtil;

import aurora.database.FetchDescriptor;
import aurora.database.IResultSetConsumer;
import uncertain.composite.CompositeMap;

public abstract class BaseController<T> implements IController<T> {
	private Map mapParaData;
	private IResultSetConsumer consumer;
	private FetchDescriptor filterData;
	public BaseController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompositeMap query(CompositeMap map) {
		// TODO Auto-generated method stub
		
		return null;
	}

	
	public void setAttributes(CompositeMap mapAll){
		this.setMapParaData(mapAll);
		this.setFilterData(mapAll);
		this.setConsumer(mapAll);
	}
	

	public void setMapParaData(CompositeMap mapAll){
		if(mapAll.get("parametersNext")!=null){
			mapParaData=(CompositeMap) mapAll.get("parametersNext");
		         //MapBeanData前端传入的一个实体数据
		}
		
		
	}
	
	public IResultSetConsumer setConsumer(CompositeMap mapAll){
	
		if(mapAll.get("consumerNext")!=null)

		{
			consumer = (IResultSetConsumer) mapAll.get("consumerNext");
		}
		return consumer;
	}
	
	
	public Map getMapParaData() {
		return mapParaData;
	}

	public IResultSetConsumer getConsumer() {
		return consumer;
	}

	public FetchDescriptor getFilterData() {
		return filterData;
	}

	public FetchDescriptor setFilterData(CompositeMap mapAll) {
		if (mapAll.get("descNext") != null) {
			filterData = (FetchDescriptor) mapAll.get("descNext");
		}

		return filterData;
	}
	
  

	/**
	 * 
	 * 
	 * @param beanClassPath:实体类的路径
	 * @return 带参数值的对象实体类
	 */
	public <T> T getBean(T t, Map map) {
		t = BaseUtil.initBean(t, map);
		return t;
	}

	/**
	 * 
	 * @param parameters
	 * @return true 代表model路径为java classpath路径
	 */
	public String getclassPath(Map parameters) {
		String classPath = null;
		CompositeMap parameter = (CompositeMap) parameters;
		if (parameter.getParent() != null) {
			CompositeMap parameterMap = parameter.getParent();
			if (parameterMap.get("requested_bm_name") != null) {
				String bmUrl = (String) parameterMap.get("requested_bm_name").toString().trim();
				classPath = BaseUtil.getJavaClassPath(bmUrl);

			}

		}

		return classPath;

	}
	public CompositeMap getCurrentParameter(CompositeMap mapAll){
		CompositeMap currentParameter=null;
		if(mapAll.get("currentParameter")!=null)

		{
			currentParameter =  (CompositeMap) mapAll.get("currentParameter");
		}
		
		 return currentParameter;
	}
	
	public T mapTobean(Map beanMap,T t){
		t=mybatisUtil.initBean(beanMap, t);
		return t;
		
	}
	/**
	 * 
	 * @param mapAll:insert或者query等传入参数
	 * @param t 赋值后的实体类名
	 * @return
	 */
	public T getBeanFromMap(CompositeMap mapAll,T t){
		CompositeMap currentParameter= getCurrentParameter(mapAll);
		t=mybatisUtil.initBean(currentParameter, t);
		return t;
	}
	

}
