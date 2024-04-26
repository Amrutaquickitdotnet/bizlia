package com.bizlia.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
public class DataBaseConnectorPage {

	public DataBaseConnectorPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		

		PageFactory.initElements(driver, this);
	}

	
	
	    private static final String URL = "jdbc:mysql://bizliadb.mysql.database.azure.com/bizlia-dev-v4";
	    private static final String USER = "bizliaDevUser";
	    private static final String PASSWORD = "W0rk@B1zl1aDB2024";

	    public String fetchAuthenticationEmailCode(String email) {
	        String authenticationCode = null;
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            Statement statement = connection.createStatement();
	           
	            
	            String query = "  SELECT email_verification_code, phone_verification_code FROM users where email = '" + email + "'";
	            ResultSet resultSet = statement.executeQuery(query);
	            if (resultSet.next()) {
	                authenticationCode = resultSet.getString("email_verification_code");
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return authenticationCode;
	    }
	    
	    public String fetchAuthenticationPhoneCode(String email) {
	        String authenticationCode = null;
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            Statement statement = connection.createStatement();
	           
	            
	            String query = "SELECT email_verification_code, phone_verification_code FROM users where email = '" + email + "'";
	            ResultSet resultSet = statement.executeQuery(query);
	            if (resultSet.next()) {
	                authenticationCode = resultSet.getString("phone_verification_code");
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return authenticationCode;
	    }
	    
	    
	    public String fetchLoginPhoneCode(String email) {
	        String authenticationCode = null;
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            Statement statement = connection.createStatement();
	           
	            
	            String query = "SELECT login_phone_verification_code, phone_verification_code FROM users where email = '" + email + "'";
	            ResultSet resultSet = statement.executeQuery(query);
	            if (resultSet.next()) {
	                authenticationCode = resultSet.getString("login_phone_verification_code");
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return authenticationCode;
	    }
	

	    
	    public boolean deleteSignupUser(String email) {
	        boolean result = false;
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            Statement statement = connection.createStatement();
	           
	            
	            String query = "delete  FROM users where email ='" + email + "'";
	            result=  statement.execute(query);
	             
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	         return result;
	    }
	    public boolean deleteOrg(String org) {
	        boolean result = false;
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            Statement statement = connection.createStatement();
	           
	            
	            String query = "delete  FROM organizations where organization_name ='" + org + "'";
	            result=  statement.execute(query);
	             
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	         return result;
	    }
	    
	    
	    
	
}


