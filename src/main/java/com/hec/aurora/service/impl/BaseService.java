package com.hec.aurora.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import com.hec.aurora.service.IService;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by liuzh on 2014/12/11.
 */
public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public void setMapper(Mapper<T> mapper) {
		this.mapper = mapper;
	}

	public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    
   
    //TODO 其他...
}
