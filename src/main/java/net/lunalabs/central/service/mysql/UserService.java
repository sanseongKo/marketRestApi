package net.lunalabs.central.service.mysql;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import net.lunalabs.central.domain.mysql.User;
import net.lunalabs.central.mapper.mysql.UserMapper;

@RequiredArgsConstructor
@Service("MysqlUserService")
public class UserService {

	private final UserMapper userMapper;
	
	@Transactional(readOnly = true)
	public List<User> findAll(){	
		List<User> user = userMapper.findAll();	
		return user;
	}
}
