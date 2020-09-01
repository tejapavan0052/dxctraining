package markerintreface;

public class def2 {

	
	public void saveData(Object obj)
	{
	if(obj instanceof AllowStorage)//if obj(d) implements AllowStorage
	{
	System.out.println("save data");
	}
	else
	{
	System.out.println("data storage not alowed on the object");
	}



	}

	}