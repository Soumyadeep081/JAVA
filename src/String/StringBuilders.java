package String;

public class StringBuilders {
    public static void main(String[] args) {

        //String builders:
        // represents mutable sequence of characters.
         String str="hello";
         StringBuilder sb=new StringBuilder(str);
  /*/
  1.Length function:
     sb.length();
  */
        System.out.println(sb.length());

//2.append function:
// sb.append("string,char,int,double,float");
 System.out.println(sb.append(" world"));


//3.insert function:
//insert within the string.
// sb.insert(index,'char'/int/double/float/"string");
 System.out.println(sb.insert(1,'c'));



//4.SetcharAt function:
//used to replace a element from another within the string builder.
//sb.setcharAt(index,'char');
 sb.setCharAt(2, 'g');
 System.out.println(sb);

    }
}
