package com.secVault.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.secVault.entities.SecAccountsEntity;
import com.secVault.modal.Customer;


public interface Repository {
	public Connection getConnection();
	public Customer fetchCustomerByUsername(String username);
	public boolean insertCustomer(Customer cust);
	
	public List<SecAccountsEntity> fetchAllSecAccount(String userName);
	public boolean insertAccount(SecAccountsEntity account  );
	public List<SecAccountsEntity> searchByKey(String key , String CustUserName);
}
