package com.project.easypool.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Message;
import com.project.easypool.service.IeasyPoolService;

@Service
public class MessageService implements IeasyPoolService<Message> {

	private IeasyPool <Message> dao;
	
	@Autowired
	public void setDao(IeasyPool<Message> dao) {
		this.dao = dao;
	}

	@Override
	public void save(Message message) {
		dao.save(message);
		
	}

	@Override
	public void delete(Message message) {
		dao.delete(message);
		
	}

	@Override
	public Message update(Message message) {
		return dao.update(message);
	}

	@Override
	public Message find(Message message) {
		return dao.find(message);
	}
	

}
