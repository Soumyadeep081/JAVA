package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

 //Array List:
 //import java.util.ArrayList;
// ArrayList<Data Type> array_list_name = new ArrayList<>();
// Ex: Integer array list
 ArrayList<Integer> a = new ArrayList<>();
 a.add(1);
 a.add(2);
 System.out.println(a);
 System.out.println(a.size());

  //accessing element in an arraylist:
  int i=a.get(0);
  int j=a.get(1);
  System.out.println(i);
  System.out.println(j);

  //changing element in array list:
  a.set(0,3);
  System.out.println(a);
  System.out.println(a.get(0));


 //removing an element:
  a.remove(1);
  System.out.println(a);
  System.out.println(a.size());

 for(int k=0;k<a.size();k++){
     System.out.println(a.get(k));
 }

 for(int l:a) {//enhanced for loop
     System.out.println(l);
 }

    }
}
