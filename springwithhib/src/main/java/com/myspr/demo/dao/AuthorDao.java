package com.myspr.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myspr.demo.Model.Author;




@Transactional
public class AuthorDao {


@Autowired
SessionFactory factory;


public AuthorDao() {
// TODO Auto-generated constructor stub
}


public AuthorDao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveAuthor(Author author){
try{
Session session=factory.getCurrentSession();
session.save(author);
return "Author Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create Author";
}

public Author getAuthorById(int authorId){
try{
Session session=factory.getCurrentSession();
Author author=(Author)session.get(Author.class,authorId);
return author;
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return null;
}



public String updateAuthorById(Author author){
try{
Session session=factory.getCurrentSession();

System.out.println("author "+author);
session.update("Author",author);
return "Author Updated";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Cannot Update Auhtor";
}



}