package net.lunalabs.central.mapper.mysql;

import java.util.List;

import net.lunalabs.central.config.db.MysqlConnMapper;
import net.lunalabs.central.domain.mysql.Product;
import net.lunalabs.central.domain.mysql.User;

@MysqlConnMapper("MysqlUserMapper")
public interface UserMapper {
	public void save(User user); 
	public void deleteById(int id);
	public void update(User user);
	public List<User> findAll();
	public User findById(int id);
}
