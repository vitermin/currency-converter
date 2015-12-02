package org.pandey.dao;

import java.util.List;

import org.pandey.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
