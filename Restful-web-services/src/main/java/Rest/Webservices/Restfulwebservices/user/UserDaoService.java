package Rest.Webservices.Restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate > Database
	// UserDaoService > Static list

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Eve", LocalDate.now().minusYears(20)));
		users.add(new User(3, "Jim", LocalDate.now().minusYears(10)));
	}

	public List<User> findAll() {
		return users;
	}
	// public list<user>findALL(){

	// public user save(User user){

	// public User findOne (int id){

}
