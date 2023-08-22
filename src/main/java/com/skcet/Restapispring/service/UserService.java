package com.skcet.Restapispring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.Restapispring.model.UserModel;
import com.skcet.Restapispring.repository.Userrepository;
@Service

public class UserService {
@Autowired
Userrepository userrepository;
public List<UserModel>Saveinfo(){
	return userrepository.findAll();
}
public UserModel Saveinfo(UserModel U) {
	return userrepository.save(U);
}
}
