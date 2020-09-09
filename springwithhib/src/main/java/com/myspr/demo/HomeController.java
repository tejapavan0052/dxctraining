package com.myspr.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspr.demo.Model.Author;
import com.myspr.demo.dao.AuthorDao;






@Controller
public class HomeController {

@Autowired
AuthorDao dao;



@RequestMapping(value="/")
public String home(Model model)
{
return "home";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Author author)
{
String status=dao.saveAuthor(author);
model.addAttribute("status",status);
return "display";
}


@RequestMapping(value="/updatePage")
public String update()
{
return "updatePage";
}

int authorId=0;

@RequestMapping(value="/searchForUpdate")
public String searchForUpdate(Model model,@RequestParam("authorId") String authorId)
{
int authId=Integer.parseInt(authorId);
this.authorId=authId;
Author author=dao.getAuthorById(authId);
model.addAttribute(author);
return "updatePage";
}


@RequestMapping(value="/updateData")
public String updateData(@ModelAttribute Author author)
{
author.setAuthorId(authorId);
dao.updateAuthorById(author);
return "updatePage";
}



}
