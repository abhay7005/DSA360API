package com.dsa360.api.constants;
/*
 * 
 * Author :- Abhay
 * 
 * */
public interface JwtConstatnt 
{
	public static final String HEADER_STRING = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String SIGNING_KEY = "MyHealthifyApplicationSigningKEY702019272609876654321";
	public static final int ACCESS_TOKEN_VALIDITY_SECONDS = 5*60*60;
	public static final String AUTHORITIES_KEY = "scopes";
}
