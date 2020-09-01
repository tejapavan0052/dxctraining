package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myschool.dbutil.DBConnection;
import com.myschool.model.College;

public class CollegeDao {

public String createCollege(College college){
try //22 Some CLG 0
{
Connection connection=DBConnection.getConnect();

String sql="insert into clg values(?,?)";
PreparedStatement stat=connection.prepareStatement(sql);

stat.setInt(1, college.getcId());
stat.setString(2, college.getcName());

int res= stat.executeUpdate();
if(res>0)
return "College Created";
else
return "College connot be Created";
}
catch (Exception e) {
e.printStackTrace();
return "Exception "+e;
}


}

}
