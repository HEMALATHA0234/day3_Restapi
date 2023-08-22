package com.skcet.Restapispring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.Restapispring.model.UserModel;
import com.skcet.Restapispring.service.UserService;

@RestController
public class Usercontroller {
@Autowired
UserService  userservice;
@PostMapping("/Save")
public UserModel Save(@RequestBody UserModel U) {
	return userservice.Saveinfo(U);
}
@GetMapping("/get")
public List<UserModel>get(){
	return userservice.Saveinfo();
}
}
