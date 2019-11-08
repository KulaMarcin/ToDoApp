package kula.marcin.todoapp.dao;

import kula.marcin.todoapp.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
