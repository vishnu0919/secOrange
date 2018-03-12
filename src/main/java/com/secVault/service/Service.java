package com.secVault.service;

import java.util.List;
import java.util.TreeSet;

import com.secVault.entities.SecAccountsEntity;
import com.secVault.modal.Customer;
import com.secVault.modal.SecAccounts;



public interface Service {
	public boolean loginCustomer(String username , String password);
	public Customer fetchCustomerByUsername(String username);
	public boolean customerRegister(Customer cust);
	public List<SecAccounts> getAccounts( String userName);
	public boolean insertAccount(SecAccounts account , String userName);
	public List<SecAccountsEntity> getSearchAccounts(String key , String CustUserName);
	public TreeSet<SecAccounts> accountsSortByCompany(String custUserName);
	public TreeSet<SecAccounts> accountsSortByCreateDate(String custUserName);
	
}
