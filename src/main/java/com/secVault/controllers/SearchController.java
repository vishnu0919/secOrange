package com.secVault.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.secVault.entities.SecAccountsEntity;
import com.secVault.modal.Search;
import com.secVault.service.Service;

@Controller
public class SearchController {
	
	@Autowired
	Service service;
	
	@RequestMapping(value = "/SearchString", method = RequestMethod.POST)
	public String searchControllerPost( Model model , @ModelAttribute("string") Search searchString , HttpServletRequest request) {

		System.out.println("In searchController and post() ");
		
		String key = searchString.getSearch();
		HttpSession session = request.getSession(false);
		String UserName = (String) session.getAttribute("UserName");
		
		List<SecAccountsEntity> searchList = service.getSearchAccounts(key, UserName);
		
		model.addAttribute("searchResults", searchList);
		return "searchResults";
		
	}
}
