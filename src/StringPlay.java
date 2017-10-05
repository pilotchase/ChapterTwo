// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
    public static void main (String[] args)
    {
        String town = new String("Anytown, USA");
        String college = new String ("PoDunk College");

        int stringLength;
        stringLength = college.length();
        String change1, change2, change3;

        System.out.println (college + " contains " + stringLength + " characters.");

        change1 = college.toUpperCase(); // part (c)

        change2 = college.replace("O", "*"); // part (d)

        change3 = town + college; // part (e)

        System.out.println ("The final string is " + change3);
    }
}