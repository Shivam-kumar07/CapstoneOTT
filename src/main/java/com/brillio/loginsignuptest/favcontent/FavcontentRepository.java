package com.brillio.loginsignuptest.favcontent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FavcontentRepository extends JpaRepository<Favcontent, Integer> {
	Favcontent findById(int id);

}
