package com.brillio.loginsignuptest.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users , Integer> {
	
}
