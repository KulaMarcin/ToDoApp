package kula.marcin.todoapp.service;

import kula.marcin.todoapp.entity.User;
import kula.marcin.todoapp.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
