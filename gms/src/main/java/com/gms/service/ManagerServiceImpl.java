package com.gms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.dao.ManagerDao;
import com.gms.model.Manager;




@Service
public class ManagerServiceImpl implements ManagerServices{
	
	@Autowired
	ManagerDao managerDao;
	
	@Override
	public Manager add_manager(Manager manager) {

		return managerDao.save(manager);
	}

	@Override
	public void delete_manager(long managerId) {
		
		managerDao.deleteById(managerId);
	}

	@Override
	public Manager view_managerById(long managerId) {
		Optional <Manager> admin=managerDao.findById(managerId);
		return admin.get();
	}

	@Override
	public Iterable<Manager> view_manager() {
		
		return managerDao.findAll();
	}

	@Override
	public Manager update_manager(Manager manager) {
		
		Optional <Manager> adm=managerDao.findById(manager.getManagerId());
		
		Manager a=adm.get();
		
		a.setManagerId(manager.getManagerId());
		a.setManagerName(manager.getManagerName());
		a.setManagerPassword(manager.getManagerPassword());
		a.setManagerBloodGroup(manager.getManagerBloodGroup());
		a.setManagerEmailid(manager.getManagerEmailid());
		a.setManagerMobileNumber(manager.getManagerMobileNumber());
		
		
		a=managerDao.save(a);
		
		return a;
	}

}
