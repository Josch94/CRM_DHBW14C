package prod.businessLogic.webservices.implementation;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.*;

@WebService
public class DeveloperService {
	private ArrayList developers;

	public ArrayList getDevelopers(){
		developers = new ArrayList<>();
		developers.add("Freiseis");
		developers.add("Knecht");
		developers.add("Heunisch");
		developers.add("Zeissner");
		developers.add("Koch");
		developers.add("Ludwig");
		
		return developers;
	}
}
