package com.project.easypool.service;


public interface IeasyPoolService<T> {	
	public void save(T objet);
	public void delete(T objet);
	public T update(T objet);
	public T find(T objet);
}
