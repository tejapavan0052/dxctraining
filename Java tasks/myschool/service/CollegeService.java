package com.myschool.service;

import com.myschool.dao.CollegeDao;
import com.myschool.model.College;

public class CollegeService {

public static void main(String[] args) {

College college=new College(222,"SOME CLG");

CollegeDao dao=new CollegeDao();
System.out.println(dao.createCollege(college));

}

}
