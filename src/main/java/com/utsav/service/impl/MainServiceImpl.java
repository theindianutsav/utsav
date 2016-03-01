package com.utsav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.utsav.model.User;

@Service("mainService")
public class MainServiceImpl {

	@Autowired
	MongoOperations mongoTemplate;
	
	public void testMongoDB() {
		User user = new User("mkyong", "password123");

		// save
		mongoTemplate.save(user);

		// now user object got the created id.
		System.out.println("1. user : " + user);

		// query to search user
		Query searchUserQuery = new Query(Criteria.where("username").is(
				"mkyong"));

		// find the saved user again.
		User savedUser = mongoTemplate.findOne(searchUserQuery, User.class);
		System.out.println("2. find - savedUser : " + savedUser);

		// update password
		mongoTemplate.updateFirst(searchUserQuery,
				Update.update("password", "new password"), User.class);

		// find the updated user object
		User updatedUser = mongoTemplate.findOne(searchUserQuery, User.class);

		System.out.println("3. updatedUser : " + updatedUser);

		// delete
		//mongoTemplate.remove(searchUserQuery, User.class);

		// List, it should be empty now.
		List<User> listUser = mongoTemplate.findAll(User.class);
		System.out.println("4. Number of user = " + listUser.size());
	}

}
