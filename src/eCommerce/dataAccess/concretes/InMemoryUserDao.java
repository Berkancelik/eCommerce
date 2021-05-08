package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	private List<User> users=new ArrayList<User>();
	
	public  InMemoryUserDao() {
	

		
	}

	@Override
	public void add(User user) {

		System.out.println(" Email has been verified. Registered person  : " + user.getEmail());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		User userUpdate = users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(null);
		userUpdate.setEmail(user.getEmail());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setVerify(user.isVerify());
		
		
		
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream()
				.filter(u->u.getId()==userId)
				.findFirst()
				.orElse(null);
		users.remove(userToDelete);
		
		
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String email) {
		User user=users.stream()
				.filter(u->u.getEmail()==email)
				.findFirst()
				.orElse(null);
		return null;
	}



}
