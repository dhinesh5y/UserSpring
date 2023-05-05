package com.example.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class UserService {

	@Autowired
	UserDao useDao;

	public String addUser(User use) {
		return useDao.addUser(use);
	}

	public User getUser(int id) {
		return useDao.getUser(id);
	}

	public String deleteUser(@PathVariable int id) {

		return useDao.deleteUser(id);
	}

	public String addAllUser(List<User> use) {

		return useDao.addAllUser(use);
	}

	public List<User> getAllUser() {

		return useDao.getAllUser();
	}

	public String updateUser(User id) {
		return useDao.updateUser(id);
	}

	public List<String> getUser() {
		List<User> allUser = useDao.getAllUser();
				
		return allUser.stream().filter(x->x.getAge()>30).map(y->y.getName()).collect(Collectors.toList());
	}

	public List<User> getByGender(String gen) {
		List<User> gend = useDao.getAllUser();
		return gend.stream().filter(x -> x.getGender().equalsIgnoreCase(gen)).collect(Collectors.toList());
	}

	public List<User> getByMailId(String mail) {
		List<User> mai = useDao.getAllUser();
		return mai.stream().filter(x->x.getMailId().equalsIgnoreCase(mail)).collect(Collectors.toList());
		
	}

	public List<User> getByPhone(long phone) {
		List<User> ph = useDao.getAllUser();
		return ph.stream().filter(x->x.getPhoneNumber()==phone).collect(Collectors.toList());
	}

	public List<Long> getByPhone(String mal) {
		List<User> male = useDao.getAllUser();
		return male.stream().filter(x -> x.getGender().equalsIgnoreCase(mal)).map(y->y.getPhoneNumber()).collect(Collectors.toList());
	}

}
