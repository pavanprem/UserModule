package com.cg.demo.exceptions;
/**************************************************************************
 * @author                 G.Pavan
 * Description             It is an exception class that handles the exception that occurs at 
 *                         service level
 * version                 1.0
 * created date            24-03-2021
 *
 ************************************************************************************/
public class UserModuleException extends RuntimeException {
	public UserModuleException(String ExceptionMessage) {
		super(ExceptionMessage);
	}
}
