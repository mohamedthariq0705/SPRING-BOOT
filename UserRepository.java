package com.myapp.demo;
import org.springframework.data.repository.CrudRepository;
import com.myapp.demo.User;
public interface UserRepository extends CrudRepository<User,Integer>
{

	

}
