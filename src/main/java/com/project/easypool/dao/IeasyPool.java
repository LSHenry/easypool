package com.project.easypool.dao;


public interface IeasyPool<T> {	
	public void save(T objet);
	public void delete(T objet);
	public T update(T objet);
	public T find(T objet);
}
