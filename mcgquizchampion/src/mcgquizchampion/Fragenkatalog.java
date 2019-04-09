package mcgquizchampion;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;


public class Fragenkatalog {
  HashMap<String, HashMap<Integer, ArrayList<Frage>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Frage>>>();
ArrayList<String> kategorien = new ArrayList<String>();

public Fragenkatalog()
{

	
	
	
	


katogorienFuellen();
for(int i = 0; i<kategorien.size();i++)
{
	fragenliste.put(kategorien.get(i), new HashMap<Integer, ArrayList<Frage>>());
}


}
private void katogorienFuellen()
{
	kategorien.add("Informatik");
	kategorien.add("Sport");
	kategorien.add("Mathematik");
	kategorien.add("Games");
	kategorien.add("Rund um die Welt");
	kategorien.add("Musik");
	kategorien.add("Im Labor");
	kategorien.add("Regelion");
	kategorien.add("Chemie");
	kategorien.add("In der Natur");

}
  
}
