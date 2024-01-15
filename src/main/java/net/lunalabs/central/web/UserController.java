package net.lunalabs.central.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.lunalabs.central.domain.mysql.User;
import net.lunalabs.central.service.mysql.UserService;
import net.lunalabs.central.web.dto.CMRespDto;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	private final UserService userService;
	
	@GetMapping("/user")
	public List<User> findAll() {

		log.info("리스트 뿌리기");

		return userService.findAll();
	}
}
