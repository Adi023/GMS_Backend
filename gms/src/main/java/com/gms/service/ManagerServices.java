package com.gms.service;

import com.gms.model.Manager;

public interface ManagerServices {
	

	public Manager add_manager(Manager manager);
	public void delete_manager(long managerId);
	public Iterable<Manager> view_manager();
	Manager view_managerById(long managerId);
	public Manager update_manager(Manager manager);

}
