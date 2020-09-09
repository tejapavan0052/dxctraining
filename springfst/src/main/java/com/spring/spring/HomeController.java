package com.spring.spring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {


@InitBinder
public void initBinder(WebDataBinder binder) {

//YYYY/MM/DD
SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));

}


@RequestMapping(value = "/")
public String home() {
return "home";
}


@RequestMapping(value="display")
public String myMeth2(@ModelAttribute Student student)
{

return "design";
}

}