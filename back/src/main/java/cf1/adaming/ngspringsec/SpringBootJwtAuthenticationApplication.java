package cf1.adaming.ngspringsec;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import cf1.adaming.ngspringsec.model.CarteCredit;
import cf1.adaming.ngspringsec.model.Role;
import cf1.adaming.ngspringsec.model.RoleName;
import cf1.adaming.ngspringsec.model.User;
import cf1.adaming.ngspringsec.repository.CarteCreditRepository;
import cf1.adaming.ngspringsec.repository.RoleRepository;
import cf1.adaming.ngspringsec.repository.UserRepository;
import cf1.adaming.ngspringsec.security.WebSecurityConfig;

@SpringBootApplication
public class SpringBootJwtAuthenticationApplication implements CommandLineRunner{
	@Autowired
	private CarteCreditRepository ccr;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtAuthenticationApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User();
		u1.setEmail("paul@adaming.com");
		u1.setName("Paul");
		u1.setPassword(WebSecurityConfig.passwordEncoder().encode("Password1"));
		u1.setUsername("paul");
		createUser(u1, RoleName.ROLE_ADMIN);
		
		User u2 = new User();
		u2.setEmail("alice@adaming.com");
		u2.setName("Alice");
		u2.setPassword(WebSecurityConfig.passwordEncoder().encode("Password1"));
		u2.setUsername("alice");
		createUser(u2, RoleName.ROLE_ADMIN);
		
		CarteCredit carte= new CarteCredit();
		carte.setCccvv("123");
		carte.setCcnumero("12345");
		carte.setCcexpiration("12/05");
		carte.setCccvv(WebSecurityConfig.passwordEncoder().encode(carte.getCccvv()));
		carte.setCcnumero(WebSecurityConfig.passwordEncoder().encode(carte.getCcnumero().toString()));
		carte.setCcexpiration(WebSecurityConfig.passwordEncoder().encode(carte.getCcexpiration()));
		carte=ccr.save(carte);
	}
	private User createUser(User user, RoleName roleName) {
		if(userRepository.existsByUsername(user.getUsername())) {
			System.out.println(user.getUsername() + " already exists. Nothing to do");
		}else {
			Set<Role> roles = new HashSet<>();
			Role role = roleRepository.findByName(roleName).get();
			roles.add(role);
			user.setRoles(roles);
			user = userRepository.save(user);
		}
		return user;
	}
}
