package com.hec.aurora.controller;

import java.util.List;

import uncertain.composite.CompositeMap;

public interface IController<T> {

	public CompositeMap query(CompositeMap map);

	public CompositeMap insert(CompositeMap map);

	public CompositeMap update(CompositeMap map);

	public CompositeMap delete(CompositeMap map);

	public CompositeMap execute(CompositeMap map);

}
