package com.google.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.UserService.entity.UserService;
import com.google.UserService.repository.UserServiceRepository;

@RestController
@RequestMapping("/UserService")
public class userserviceController {
	@Autowired
	UserServiceRepository repo;
	
	@PostMapping
	public UserService addUser(@RequestBody UserService U)	
	{
		return repo.save(U);
	}
      @GetMapping
      public List<UserService> getUser()
      {
   	  return repo.findAll();
      }
     @GetMapping("/{id}")
      public UserService getUserserviceById(@PathVariable  Long id)
      {
   	  return  repo.findById(id).get();  
      }  
       @DeleteMapping("/{id}")
       public void deleteUser(@PathVariable Long id)
      
      { 	
       	repo.deleteById(id);
       }
      
       @PutMapping
       public UserService updateUser(@PathVariable Long id,@RequestBody UserService U)
       {
       	U.setId(id);
       	return repo.save(U);
       }
       
       
      
}

