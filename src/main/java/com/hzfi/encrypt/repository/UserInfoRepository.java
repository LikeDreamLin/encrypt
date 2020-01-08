package com.hzfi.encrypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hzfi.encrypt.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

}
