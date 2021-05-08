package eCommerce.core;

import eCommerce.entities.concretes.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExþsts(String email);
	void login(LoginDto dto);

}
