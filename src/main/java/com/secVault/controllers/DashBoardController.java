//package com.secVault.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.secVault.modal.LoginForm;
//import com.secVault.modal.Search;
//import com.secVault.modal.SecAccounts;
//
//@Controller
//public class DashBoardController {
//	@RequestMapping(value = "/dashBoard", method = RequestMethod.GET)
//	public String dashBoardGet( Model model,  @ModelAttribute("acount") SecAccounts accountsForm , @ModelAttribute("searchString") Search searchString) {
//
//		System.out.println("In DashBoardController  get()");
//
//		return "dashBoard";
//	}
//	@RequestMapping(value = "/dashBoard", method = RequestMethod.POST)
//	public String dashBoardPost( Model model) {
//
//		
//		/*LoginForm loginForm = new LoginForm();
//		model.addAttribute("loginnnn", loginForm); */
//		// the above step is similar to request.setAttribute("", "");
//
//		System.out.println("In DashBoardController  post()");
//
//		return null;
//	}
//}
