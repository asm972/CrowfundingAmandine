package cf1.adaming.ngspringsec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.User;
import cf1.adaming.ngspringsec.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestRestAPIs {
	@Autowired
	private UserRepository ur;
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return "Dispaly Users Contents!";
	}

	@GetMapping("/pm")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return "Display PMs Content here.";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Only Admin Content here. No unauthorized access!";
	}
	
	@GetMapping("/user/current/{username}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public User findbyusername(@PathVariable("username")String username) {
		
		return ur.findByUsername(username).get();
	}
	
}