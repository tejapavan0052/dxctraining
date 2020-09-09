package com.myshowroom.demo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myshowroom.demo.beans.Car;
import com.myshowroom.demo.beans.Showroom;


@Controller
public class HomeController {
@RequestMapping(value = "/", method = RequestMethod.GET)
public String home() {
return "home";
}

String name="";

@RequestMapping(value = "/addCars", method = RequestMethod.GET)
public String addCars(@RequestParam ("showroom") String name) {

this.name=name;
return "addCars";
}

ArrayList<Car> cars=new ArrayList<Car>();

@RequestMapping(value = "/addCars2", method = RequestMethod.GET)
public String addCars2(@ModelAttribute Car car) {

cars.add(car);
return "addCars";
}

@RequestMapping(value = "/displayCars", method = RequestMethod.GET)
public String dispCars(Model model) {


Showroom showroom =new Showroom(name, cars);
model.addAttribute("showroom",showroom);

return "displayCars";
}




}