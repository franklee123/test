package com.fstop.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fstop.test.dao.UserDao;
import com.fstop.test.entity.User;
@Service
public class exampleService {
	@Autowired
    private UserDao UserDao;
	
	  public List<User> getUserList() {    
	      return UserDao.findAll(); 
	    }
	  
	  public User createUser(User test) {
			return UserDao.save(test);
		}
	 
	  public User getUserById(String id) {
			return UserDao.getOne(id);
		}
	  
	  public void upDateUser(User test) {
		   
			UserDao.save(test);	
		}

	  public String deleteUser(String id) {
			UserDao.deleteById(id);
			return "ok";
		}
}
