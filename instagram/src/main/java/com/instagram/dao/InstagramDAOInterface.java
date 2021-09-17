package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu);
	
	boolean loginProfileDAO(InstagramUser iu);

	InstagramUser viewProfile(InstagramUser iu);

	int editProfileDAO(InstagramUser iu1);

	int deleteProfileDAO(InstagramUser iu);

	

	

}
