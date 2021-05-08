package eCommerce.core;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class googleAuthManagerAdapter implements ExternalAuthService{
	
	private UserService userService;

	public googleAuthManagerAdapter(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if(userExþsts(email)==false) {
			userService.add(null);
		}
		else {
			User user = userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}

	@Override
	public boolean userExþsts(String email) {
		if(userService.get(email)!= null)
		{
			return true;
		}
		return false;
		  
	}

	@Override
	public void login(LoginDto dto) {
		if(dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("You have successfully logged in.");
		}
		else {
			System.out.println("Username or password is incorrect");
		}
	}

}
