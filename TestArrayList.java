import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {


	public static void main (String[] args) {
		int a1 = 3, a2 = 5, a3 = 7;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		System.out.println("Array size = " + arr.size());
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
		System.out.println("");
		for (int i = 0; i < arr.size(); ++i) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("");

		Collections.reverse(arr);
		System.out.println("After reversing the original arraylist: ");
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
		System.out.println("");
		
		System.out.println("arr contains a1 ? " + arr.contains(3));
		System.out.println("Index of a1 : " + arr.indexOf(a1));

		List<Integer> arrClone = new ArrayList<>(arr); //shallow copy
		System.out.println("arrClone:");
		System.out.println(arrClone);

		List<Object> objectArray = new ArrayList<>();
		objectArray.add(new Cat(1, 2, 3));
		objectArray.add(new Animal());
		objectArray.add(new Person("Allen", 23));
		System.out.println(objectArray);
	}
}