package player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myserv.dbutil.DbConnection;

import sbaassement3.DBConnection;



public class PlayerDao {



public String generatePlayerId(String fname,String lname){
String playerId="";
String seqNum="";
int seqNumber=0;
try{
Connection con=  DbConnection.getConnect();
String sql="select seqplayer.nextval from dual";
PreparedStatement stat=con.prepareStatement(sql);
ResultSet rs= stat.executeQuery();
if(rs.next()){
seqNumber=rs.getInt(1);
}
}
catch (Exception e) {
e.printStackTrace();
}
if(seqNumber < 100 && seqNumber >=10)
seqNum="0"+seqNumber;
else if(seqNumber<10)
seqNum="00"+seqNumber;
else
seqNum=""+seqNumber;

playerId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

return playerId;
}

public String savePlayer(Player player)
{

try
{
Connection con=  DbConnection.getConnect();
String sql="insert into player values(?,?,?,?)";

PreparedStatement stat=con.prepareStatement(sql);


player.setPlayerId(generatePlayerId(player.getFname(), player.getLname()));

stat.setString(1, player.getPlayerId());
stat.setDate(2, new java.sql.Date(player.getDob().getTime()));
stat.setString(3, player.getFname());
stat.setString(4, player.getLname());

int res=stat.executeUpdate();

if(res>0)
return "player created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Unable to create player";
}

}




