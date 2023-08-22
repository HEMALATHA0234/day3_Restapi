package com.skcet.Restapispring.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.skcet.Restapispring.model.UserModel;

public interface Userrepository extends JpaRepository<UserModel,Integer>{

}
