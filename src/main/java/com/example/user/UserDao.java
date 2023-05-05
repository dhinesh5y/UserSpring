package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


@Repository
public class UserDao {
	
	@Autowired
	UserRepository useRepo;
	public String addUser(User use) {
		useRepo.save(use);
		return "Succesfully Saved";
	}
	public User getUser(int id) {
		
		return useRepo.findById(id).get();
	}
	public String deleteUser(@PathVariable int id) {
		useRepo.deleteById(id);
		return "Successfully Delete";
	}
	public String addAllUser(List<User> use) {
		useRepo.saveAll(use);
		return "Successfully AddAll";
	}
	public List<User> getAllUser() {
		
		return useRepo.findAll();
	}
	public String updateUser(User id) {
		useRepo.save(id);
		return "Successfully Updated";
	}
}
