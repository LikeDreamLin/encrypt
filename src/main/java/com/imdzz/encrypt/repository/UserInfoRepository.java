package com.imdzz.encrypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imdzz.encrypt.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

}
