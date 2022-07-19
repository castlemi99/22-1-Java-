import java.util.LinkedList;
import java.util.ListIterator;

class ListTest 
{
	public static void main(String[] args) 
	{
		LinkedList<String> friends = new LinkedList<String>();

		friends.addLast("Kim");
		friends.addLast("Lee");
		friends.addLast("Park");
		friends.addLast("Yoon");

		System.out.println(friends);


		ListIterator<String> iterator = friends.listIterator();

		iterator.next(); //[K]
		iterator.next(); //[KL]

		iterator.add("Im"); //[KLI]
		iterator.add("Dong"); //[KLID]

		iterator.next();//[KLIDP]
		iterator.next();//[KLIDPY]

		iterator.remove();//[KLIDP]

		System.out.println(friends);
	}
}
