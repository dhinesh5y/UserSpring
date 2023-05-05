package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserService useSer;

	@PostMapping(value = "/add")
	public String addUser(@RequestBody User use) {
		return useSer.addUser(use);
	}

	@GetMapping(value = "/get/{id}")
	public User getUser(@PathVariable int id) {
		return useSer.getUser(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return useSer.deleteUser(id);
	}

	@PostMapping(value = "/addall")
	public String addAllUser(@RequestBody List<User> use) {
		return useSer.addAllUser(use);
	}

	@GetMapping(value = "/getall")
	public List<User> getAllUser() {
		return useSer.getAllUser();
	}

	@PutMapping(value = "/update/{id}")
	public String updateUser(@RequestBody User id) {
		return useSer.updateUser(id);
	}

	@GetMapping(value = "/getname")
	public List<String> getUserName() {
		return useSer.getUser();
	}

	@GetMapping(value = "/getgender/{gen}")
	public List<User> getByGender(@PathVariable String gen) {
		return useSer.getByGender(gen);
	}

	@GetMapping(value = "/getmail/{mail}")
	public List<User> getByMailId(@PathVariable String mail) {
		return useSer.getByMailId(mail);
	}

	@GetMapping(value = "/getphone/{phone}")
	public List<User> getByPhone(@PathVariable long phone) {
		return useSer.getByPhone(phone);
	}

	@GetMapping(value = "/getmale/{mal}")
	public List<Long> getByMale(@PathVariable String mal) {
		return useSer.getByPhone(mal);
	}
}
