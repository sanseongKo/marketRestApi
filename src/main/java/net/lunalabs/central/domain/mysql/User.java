package net.lunalabs.central.domain.mysql;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	//private Long msrl;
	private int seq;
	private String userId;
	private String password;
	private String userName;
	private String provider;
	private String sex;
	private String age;
	private String area;
	private String memo;
	private String level;
	private int point;
	private String phone;
	private String img;
	private String email;
	private String si;
	private String gu;
	private String dong;
	private String smsAuth;
	private String smsAuthDate;
	private String regDate;
	private String regUser;
	private String modDate;
	private String modUser;
	private String lastLogin;
	private String logoutDate;
	private String role;
	//private List<String> roles = new ArrayList<>();
	
}
