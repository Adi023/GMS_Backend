package com.gms.service;

import com.gms.model.Admin;

public interface AdminServices {

	public Admin add_admin(Admin admin);
	public void delete_admin(long admin_id);
	public Iterable<Admin> view_admin();
	Admin view_adminById(long admin_id);
	public Admin update_admin(Admin admin);
}
