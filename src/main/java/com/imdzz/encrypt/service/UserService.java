package com.imdzz.encrypt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdzz.encrypt.model.UserInfo;
import com.imdzz.encrypt.repository.UserInfoRepository;

@Service
public class UserService {

	@Autowired
	UserInfoRepository userInfoRepository;

	public String batchCreateUser(){

		for (int i = 0; i < 1000; i++){
			System.out.println("处理第" + i + "个");
			UserInfo user = new UserInfo();
			user.setId(String.valueOf(i)).setUserName("小王"+i).setSex("男").
				setPapersNo("123456789012" + i*i).setPhoneNo("12345678901").setAddress("杭州市江干区");
			userInfoRepository.save(user);
		}

		return "ok";
	}


	public String createUser(String id){
		UserInfo user = new UserInfo();
		user.setId(String.valueOf(id)).setUserName("小王"+id).setSex("男")
			.setPapersNo("123456789012" + id).setPhoneNo("12345678901").setAddress("杭州市江干区");
		userInfoRepository.save(user);

		return "ok";
	}

	public String findUser(String id){
		System.out.println("查找用户:" + id);
		return userInfoRepository.findById(id).get().getPapersNo();
	}
}
