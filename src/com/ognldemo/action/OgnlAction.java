package com.ognldemo.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.sun.org.apache.xml.internal.security.Init;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.ognldemo.model.Employee;
import com.ognldemo.model.Address;

public class OgnlAction implements Action,ParameterAware,RequestAware,SessionAware,ApplicationAware {
	private Map parameters;
	private Map request;
	private Map session;
	private Map application;
	private List<Employee> emps = new ArrayList<Employee>();
	/**
	 * 初始化雇员信息
	 */
	public void initEmps()
	{
		Address address1 = new Address("中国", "北京", "海淀南路18号");
		Address address2 = new Address("中国", "上海", "南京西路20号");
		Address address3 = new Address("中国", "成都", "春熙路8号");
		
		String[] emails1 = new String[]{"zhangsan@sina.com","zhangsan@163.com"};
		String[] emails2 = new String[]{"lisi@sina.com","lisi@163.com"};
		String[] emails3 = new String[]{"wangwu@sina.com","wangwu@163.com"};
		
		Map<String, String> accounts1 = new HashMap<String,String>();
		accounts1.put("建行", "12345678");
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setParameters(Map<String, String[]> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
