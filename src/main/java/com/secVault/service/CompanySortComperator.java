package com.secVault.service;

import java.util.Comparator;

import com.secVault.modal.SecAccounts;

public class CompanySortComperator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		SecAccounts account1 = (SecAccounts) o1;
		SecAccounts account2 = (SecAccounts) o2;
		
		String company1 = account1.getCompanyName();
		String company2 = account2.getCompanyName();
		int account1_Id = account1.getId();
		int account2_Id = account2.getId();
		
		if(company1.equals(company2)) {
			
			return account1_Id - account2_Id;
		}
		
		return company1.compareToIgnoreCase(company2);
	}
	
}
