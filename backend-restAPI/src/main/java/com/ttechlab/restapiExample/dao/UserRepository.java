package com.ttechlab.restapiExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.ttechlab.restapiExample.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
