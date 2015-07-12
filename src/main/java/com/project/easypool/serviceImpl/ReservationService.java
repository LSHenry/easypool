package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Reservation;
import com.project.easypool.service.IeasyPoolService;

@Service
public class ReservationService implements IeasyPoolService<Reservation> {

	
	private IeasyPool<Reservation> dao;	

	@Autowired
	public void setDao(IeasyPool<Reservation> dao) {
		this.dao = dao;
	}

	@Override
	public void save(Reservation reservation) {
		dao.save(reservation);
		
	}

	@Override
	public void delete(Reservation reservation) {
		dao.delete(reservation);
		
	}

	@Override
	public Reservation update(Reservation reservation) {
		
		return dao.update(reservation);
	}

	@Override
	public Reservation find(Reservation reservation) {
		
		return dao.find(reservation);
	}
	



}
