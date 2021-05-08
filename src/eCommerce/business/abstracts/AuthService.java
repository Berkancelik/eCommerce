package eCommerce.business.abstracts;

import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
	void verify(User user);
	

}
