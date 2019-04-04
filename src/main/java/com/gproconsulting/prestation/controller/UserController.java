package com.gproconsulting.prestation.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.service.UserServiceInterface;


@Controller
@ComponentScan
public class UserController {

	@Autowired
	UserServiceInterface UserServiceInterface;
	
	@GetMapping("/")
	public String savePage(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("allUsers", (ArrayList<User>)UserServiceInterface.getAllUsers());
		return "index";
	}
	
	@PostMapping("/user/save")
	public String saveUser(@ModelAttribute("user") User user,
			final RedirectAttributes redirectAttributes) {
		
		if(UserServiceInterface.saveUser(user)!=null) {
			redirectAttributes.addFlashAttribute("saveUser", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveUser", "unsuccess");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/user/{operation}/{userId}", method = RequestMethod.GET)
	public String editRemoveUser(@PathVariable("operation") String operation,
			@PathVariable("userId") Long userId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(UserServiceInterface.deleteUser(userId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		  User editUser = UserServiceInterface.findUser(userId);
		  if(editUser!=null) {
		       model.addAttribute("editUser", editUser);
		       return "editPage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("editUser") User editUser,
			final RedirectAttributes redirectAttributes) {
		if(UserServiceInterface.editUser(editUser)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}
		return "redirect:/";
	}
}
