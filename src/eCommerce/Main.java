package eCommerce;
import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.EmailService;
import eCommerce.core.googleAuthManagerAdapter;
import eCommerce.core.googleMailManagerAdapter.GoogleMailManagerAdapter;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;
import eCommerce.googleMail.GoogleMailManager;

public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		AuthManager authManager = new AuthManager(new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter()) );
		
		User berkan = new User(1,"Berkan", "çelik" ,"ahmey@gmail.com ","2335ff56",true);
		User ahmet = new User(2,"Ahmet", "sarsýlamz" ,"ahmey@gmail.com ","2335ff5deg6",true);
		
		

		
		
		UserManager userManager = new UserManager(new InMemoryUserDao(), new GoogleMailManagerAdapter());
		System.out.println("-------------------------------------------------------------");
		userManager.add(ahmet);
	
		
		
	}

}
