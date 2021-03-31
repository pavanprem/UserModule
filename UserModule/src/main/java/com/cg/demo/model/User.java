package com.cg.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private String userId;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	
	/************************************************************************************
	 * Method:                          User
     *Description:                      It is used to initialize the empty constructor.
     *Created By                        G.Pavan
     *Created Date                      24-MARCH-2021  
	*************************************************************************************/

	public User() {
		super();
	}
	
	/************************************************************************************
	 * Method:                                 User
     *Description:                             It is used to initialize the parameterized constructor.
     *@param userid:                           user id 
     *@param password:                         user password 
     *@param role:                             user role 
     *Created By                               G.Pavan
     *Created Date                             24-MARCH-2021                           
	 
	 ************************************************************************************/

	public User(String userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	
	/***************************************************************
	 * Method                    getuserId
	 * Description               It is used to get the userId by getter method
	 * @return string            it returns userId
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	
	
	public String getUserId() {
		return userId;
	}
	
	/***************************************************************
	 * Method                    setUserId
	 * Description               It is used to get the userId by setter method
	 * @return string            it returns userId
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/***************************************************************
	 * Method                    getPassword
	 * Description               It is used to get the userPassword by getter method
	 * @return string            it returns userPassword
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	

	public String getPassword() {
		return password;
	}
	
	/***************************************************************
	 * Method                    setPassword
	 * Description               It is used to set the userPassword by setter method
	 * @return string            it returns userPassword
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	

	public void setPassword(String password) {
		this.password = password;
	}
	
	/***************************************************************
	 * Method                    getRole
	 * Description               It is used to get the userRole by getter method
	 * @return string            it returns userRole
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	

	public String getRole() {
		return role;
	}
	
	/***************************************************************
	 * Method                    setRole
	 * Description               It is used to set the userRole by setter method
	 * @return string            it returns userRole
	 * created by                G.Pavan
	 * created date              24-03-2021
	 *******************************************************************/	

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
}
