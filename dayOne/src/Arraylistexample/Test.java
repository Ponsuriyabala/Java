package Arraylistexample;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Person suriya = new Person();
		suriya.init("suriya", 97, 97, 98);
		Person suriya1 = new Person();
		suriya1.init("suriya1", 98, 97, 98);
		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(suriya);
		personlist.add(suriya1);
		int phy=0;
        int chem=0;
        int mat=0;
		for(Person obj :personlist)
		{
			//System.out.println(obj.getAll());
			if(obj.name.equals("suriya1"))
			{
				ArrayList list = obj.getAll();
				phy=(int)list.get(1);
				chem=(int)list.get(2);
				mat = (int)list.get(3);
			}
		}
		System.out.println(phy+" "+chem+" "+mat);
	}

}
