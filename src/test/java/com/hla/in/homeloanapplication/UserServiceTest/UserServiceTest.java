package com.hla.in.homeloanapplication.UserServiceTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import com.hla.in.homeloanapplication.repository.IUserRepository;
import com.hla.in.homeloanapplication.service.impl.IUserServiceImpl;
import com.hla.in.homeloanapplication.entities.User;

class UserServiceTest {
	IUserRepository userRepo;
	private static IUserServiceImpl userService;
	private static AutoCloseable ac;
	
	@BeforeEach
	public void doinit()
	{
	      userRepo = mock(IUserRepository.class); 
	      userService = new IUserServiceImpl(); 
		ac = MockitoAnnotations.openMocks(this);
	}

	@AfterEach
	public void doAtEnd()throws Exception
	{
		ac.close();
	}
	@Test
	//@Disabled
	@DisplayName("Add Admin as User")
	void addAdmin() {
	
		User input = new User();
		input.setUserId(2);
		input.setPassword("Ram");
		input.setRole("Admin");
 
		
		when(userRepo.save(input)).thenReturn(input);
	    User user_test = userService.addNewUser(input);
	    
	    
		assertEquals(input,user_test);
	}
	@Test
	//@Disabled
	@DisplayName("Add financeofficer as User")
	void addFinanceOfficer() {
	
		User input = new User();
		input.setUserId(2);
		input.setPassword("Prasad");
		input.setRole("financeofficer");
        
		
		when(userRepo.save(input)).thenReturn(input);
	    User user_test = userService.addNewUser(input);
	    
	    
		assertEquals(input,user_test);
	}
	@Test
	//@Disabled
	@DisplayName("Add Landofficer as User")
	void addLandOfficer() {
	
		User input = new User();
		input.setUserId(2);
		input.setPassword("Rolex");
		input.setRole("Landofficer");
		
		when(userRepo.save(input)).thenReturn(input);
	    User user_test = userService.addNewUser(input);
	    
	    
		assertEquals(input,user_test);
	}



	

}
