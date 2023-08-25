package com.it.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.dao.IUserRepository;
import com.it.model.User;
	@Service
	@Transactional
public class UserServiceImpl implements IUserService 
	{
		@Autowired
		IUserRepository iUserRepository;
		
		@Override
		public User SaveUser(User user) 
		{
			iUserRepository.save(user);
			return user;
		}
	}
	
	
	
	
		   
	
	
	
