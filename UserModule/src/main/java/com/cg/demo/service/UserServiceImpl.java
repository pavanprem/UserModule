package com.cg.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.exceptions.UserModuleException;
import com.cg.demo.model.User;
import com.cg.demo.repository.UserRepo;

/**********************************************************************************
 * @author                 G.Pavan
 * Description             It is a user service implementation class that defines the methods
 *                         mentioned in its interface.
 * Version                 1.0
 * created date            24-03-2021
 *
 ****************************************************************************************/

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userrepo;
	
	/************************************************************************************
	 * Method                     signIn
	 * Description                It is used to signIn into application
	 * @param user                user's reference variable
	 * @UserModuleException       It is raised due to invalid user details
	 * created by                 G.Pavan
	 * created date               24-03-2021
	 ***********************************************************************************/
	
	@Override
	public Boolean signIn(User user) {

		Boolean status = false;
		Optional<User> resultUser = userrepo.findById(user.getUserId());
		if ((resultUser != null) && (resultUser.get().getPassword().equals(user.getPassword()))) {
			if (resultUser.get().getRole().equals(user.getRole())) {
				status = true;
			}
			else {
				throw new UserModuleException("role not found");
			}
		}
		else {
			throw new UserModuleException("invalid id,password");
		}
		return status;
	}
	
	/*******************************************************************
	 * Method                                     signOut
	 * Description                                It is used to signOut from application
	 * @param user                                user's reference variable
	 * @UserModuleException                       It raised due to invalid user details
	 * created by                                 G.Pavan
	 * Created date                               24-03-2021
	 ***********************************************************************/
	
    @Override
	public Boolean signOut(User user) {

		Boolean status = false;
		Optional<User> resultUser = userrepo.findById(user.getUserId());
		if ((resultUser != null) && (resultUser.get().getPassword().equals(user.getPassword()))) {
			if (resultUser.get().getRole().equals(user.getRole())) {
				status = true;
			}
			else {
				throw new UserModuleException("role not found");
			}
		}
		else {
			throw new UserModuleException("invalid id,password");
		}
		return status;
	}
    
    /******************************************************************************
	 * Method                                changePassword
	 * Description                           It is used to change the password
	 * @param user                           User's refernce variable
	 * @UserModuleException                  It is raised due to invalid password
	 * created by                            G.Pavan
	 * created date                          24-03-2021
	 ********************************************************************************/
    
    @Override
	public User changePassword(String id, String oldpassword, String newpassword) {

		User changeUser = null;
		Optional<User> resultUser = userrepo.findById(id);
		if ((resultUser != null) && (resultUser.get().getPassword().equals(oldpassword))) {
			changeUser = new User(id, newpassword, resultUser.get().getRole());
			userrepo.save(changeUser);
		}
		else {
			throw new UserModuleException("password not matched");
		}
		return changeUser;
	}
}

