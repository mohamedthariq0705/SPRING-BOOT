package com.myapp.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;

// import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class User{

    @Id 
    private Integer id;
    private String name;
    private String email;
    public Integer getId() {
        return id;
}
public  void setId(Integer id){
    this.id=id;
}
public String getName() {
    return name;
}
public String setName(String name){
        return this.name = name;
}
public String getEmail(){
    return email;
}

public void setEmail(String email)
{
    this.email = email;
}
}

