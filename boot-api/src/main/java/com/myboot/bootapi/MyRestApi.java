package com.myboot.bootapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {


@RequestMapping(value="test")
public String hello(){

return "Hello World";
}

@GetMapping(value="student")
public Student getStudent() {
Student student=new Student(10,"DHONI");
return student;
}

@GetMapping(value="student/{name}")
public Student getStudentName(@PathVariable String name){
Student student=new Student(10,name);
return student;
}


@PostMapping(value="studentdata")
public String postStudent(@RequestBody Student student)
{
System.out.println(student);
return "Data accepted";
}


@DeleteMapping(value="studentdata")
public String deleteStudent(@RequestBody String name)
{
System.out.println(name);
return "delete requested";
}


@PutMapping(value="studentdata")
public String putStudent()

{
return "putrequested";
}





}


