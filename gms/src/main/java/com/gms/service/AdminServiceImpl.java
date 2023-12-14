package com.gms.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gms.dao.AdminDao;
import com.gms.model.Admin;

@Service
public class AdminServiceImpl implements AdminServices {

	@Autowired
	AdminDao admindao;
	
	@Override
	public Admin add_admin(Admin admin) {

		return admindao.save(admin);
	}

	@Override
	public void delete_admin(long admin_id) {
		
		admindao.deleteById(admin_id);
	}

	@Override
	public Admin view_adminById(long admin_id) {
		Optional <Admin> admin=admindao.findById(admin_id);
		return admin.get();
	}

	@Override
	public Iterable<Admin> view_admin() {
		
		return admindao.findAll();
	}

	@Override
	public Admin update_admin(Admin admin) {
		
		Optional <Admin> adm=admindao.findById(admin.getAdmin_id());
		
		Admin a=adm.get();
		
		a.setAdmin_id(admin.getAdmin_id());
		a.setAdmin_name(admin.getAdmin_name());
		a.setAdmin_password(admin.getAdmin_password());
		
		a=admindao.save(a);
		
		return a;
	}

}
