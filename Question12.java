package Lab12;

import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>arraylist1=new ArrayList<String>();
arraylist1.add("Olivia");
arraylist1.add("Emma");
arraylist1.add("Ava");
arraylist1.add("Charlotte");
arraylist1.add("Sophia");
System.out.println(arraylist1);

ArrayList<String>arraylist2=new ArrayList<String>();
arraylist2.add("Noah");
arraylist2.add("Liam");
arraylist2.add("William");
arraylist2.add("Mason");
arraylist2.add("James");
System.out.println(arraylist2);

arraylist1.addAll(arraylist2);
System.out.println(arraylist1);

arraylist1.set(4, "Sophie");
System.out.println(arraylist1);

arraylist1.add(3, "Anne");
System.out.println(arraylist1);

System.out.println("Contains Liam? "+arraylist1.contains("Liam"));
System.out.println("Contains Sam? "+arraylist1.contains("Sam"));

String removed = arraylist1.remove(1);
System.out.println("After removing " + removed + ", the rest are " +arraylist1);

System.out.println("ArrayList1 size = "+ arraylist1.size());

for (int i = 0; i < arraylist1.size(); i ++) {
	System.out.println(arraylist1.get(i) +" Index of " + i);
}

	
	}

}
