package com.cg.demo.service;

import com.cg.demo.model.User;

/****************************************************************************
 * @author               G.Pavan
 * Description           It is a user service interface that describes the abstract methods
 *                       used in its implementation class.
 * version               1.0
 * created date          24-03-2021
 *
 ****************************************************************************/

public interface UserService {

	public Boolean signIn(User user) ;

	public Boolean signOut(User user);

	public User changePassword(String id, String oldpassword, String newpassword);	
}
