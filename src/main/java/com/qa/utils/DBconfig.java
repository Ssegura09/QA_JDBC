package com.qa.utils;

public class DBconfig {
	//Not ideal for security purposes
	public static String user = "root";
	//password(pw) is exposed
	public static String pw = ""; //ommitted for security purposes
	public static String url = "jdbc:mysql://localhost:3306/scanner_example?db_name&serverTimezone=UTC";
}
