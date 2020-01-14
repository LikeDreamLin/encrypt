package com.imdzz.encrypt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity(name="user_info")
@Accessors(chain = true)
public class UserInfo {
	@Id
	String id;
	String userName;
	String sex;
	String papersNo;
	String phoneNo;
	String address;
}
