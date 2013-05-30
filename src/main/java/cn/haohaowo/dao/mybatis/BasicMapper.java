package cn.haohaowo.dao.mybatis;

import java.io.Serializable;


public interface BasicMapper<T> {

	public void insert(T t);
	
	public T  get(Serializable pk);
	
	public void updateById(T t);
	
	public void deleteById(T t);
}
