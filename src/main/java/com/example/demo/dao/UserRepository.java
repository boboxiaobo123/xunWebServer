package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xhou on 2018/8/25.
 */

@Repository
public interface UserRepository extends JpaRepository<UserDao, Long> {

    UserDao findByUserName(String userName);

}
