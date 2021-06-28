package com.te.productmangment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.productmangment.bean.Products;



@Controller
public class CommanController {

	@GetMapping("/login")
	public String getEmpForm() {
		return "adminLogin";
	}// getEmpForm
	
	
	@PostMapping("/login")
	public String authenticate(int id, String password, HttpServletRequest request, ModelMap map,Products product) {
		if (id == 48&&password.equals("admin123")) {
			HttpSession session = request.getSession();
			session.setAttribute("loggedIn", product );
			map.addAttribute("id", id);
			return "productHome";
		} else {
			map.addAttribute("errMsg", "Invalid Credentials");
			return "adminLogin";
		}
	}// authenticate
}
