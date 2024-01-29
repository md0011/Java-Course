/**
 * String
 */
public class StringMethods {

    public static void main(String[] args) {
        String name = "Mayur";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     Mayur     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('r', 'p'));
        //System.out.println(name.replace("r", "ier"));

        //System.out.println(name.startsWith("May"));
        //System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "Mayuryuryur";
        //System.out.println(modifiedName.indexOf("yur"));
        //System.out.println(modifiedName.indexOf("yur", 4));
        //System.out.println(modifiedName.lastIndexOf("yur", 7));

        //System.out.println(name.equals("Mayur"));
        System.out.println(name.equalsIgnoreCase("MayUR"));

        System.out.println("I am escape sequence\tdouble quote");

    }
}