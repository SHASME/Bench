
 public class Test {
public static void main(String[] args) {
	String string1=new String("Java11");
	String string2="Java11";
	String string3=string1.intern();
	System.out.println(string1 ==string2);
	System.out.println(string2 ==string3);
}
}
