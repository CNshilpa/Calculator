
public class Hello {
public static void main(String args[])
{
	String message="Good Evening";
	System.out.println(message.length());
	//char At : index
	System.out.println(message.charAt(0));
	System.out.println(message.charAt(message.length()-1));
	System.out.println(message.toLowerCase());
	System.out.println(message.toUpperCase());
	System.out.println(message.equalsIgnoreCase(message));
	System.out.println(message.contentEquals(message));
	String msg=" Welcome  ";
	System.out.println(msg.trim());
	message=message.replace("Good", "Bad");
	System.out.println(message);
	System.out.println(message.replace("Good", "Bad"));
}
}
