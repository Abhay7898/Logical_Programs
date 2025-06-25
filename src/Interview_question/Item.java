package Interview_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
	/*Make a list of object in which same gst then amount will merge. 
	for example :- 
	a. Samsung   40000 	18% 
	b. vivo 	 27500 	18%  
	c. earphone  1500 	12% 
	d. cookies 	 100    5%
	*/
	
	String name;
	int amount;
	int gst;

	public Item(String name, int amount, int gst) {
		this.name = name;
		this.amount = amount;
		this.gst = gst;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		List l = new ArrayList();
		l.add(new Item("Samsung", 4000, 18));
		l.add(new Item("vivo", 2700, 18));
		l.add(new Item("earphone", 1500, 12));
		l.add(new Item("cookies", 100, 5));

		for (Object object : l) {
			Item i = (Item) object;
			if (m.containsKey(i.gst)) {
				m.put(i.gst, m.get(i.gst) + i.amount);
			} else {
				m.put(i.gst, i.amount);
			}
		}
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
