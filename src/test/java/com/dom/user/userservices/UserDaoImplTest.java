package com.dom.user.userservices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dom.user.userservices.dao.UserDao;
import com.dom.user.userservices.dao.UserDaoImpl;
import com.dom.user.userservices.dto.User;

import junit.framework.TestCase;



/**
 * Unit test for simple UserDaoImplTest.
 */
public class UserDaoImplTest 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@Test
    public void testShouldCreateAUser()
    {
       UserDao userDao = new UserDaoImpl(); 
       User user = new User();
       user.setId(1);
       user.setName("Dominic");
       user.setEmail("dom.keefe@gmail.com");
       userDao.create(user);
       
       User returnedUser = userDao.read(1);
       assertEquals("Dominic", returnedUser.getName());
    }
}
