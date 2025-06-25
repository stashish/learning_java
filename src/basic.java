import com.sun.jdi.BooleanType;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        System.out.println("Below are primitive data types - ");

        //byte
        byte age = 26;
        var data_type = printType(age);
        System.out.println(data_type);
        System.out.println("Size - " + Byte.BYTES + " byte");
        System.out.println("Example -> age = " + age);

        //integer
        int pincode = 411014;
        data_type = printType(pincode);
        System.out.println(data_type);
        System.out.println("Size - " + Integer.BYTES + " bytes");
        System.out.println("Example -> pincode = " + pincode);

        //long
        long mob_no = 7058087633L;
        data_type = printType(mob_no);
        System.out.println(data_type);
        System.out.println("Size - " + Long.BYTES + " bytes");
        System.out.println("Example -> mobile_no = " + mob_no);

        //float
        float weight = 60.2F;
        data_type = printType(weight);
        System.out.println(data_type);
        System.out.println("Size - " + Float.BYTES + " bytes");
        System.out.println("Example -> weight = " + weight);

        //char
        char gender = 'M';
        data_type = printType(gender);
        System.out.println(data_type);
        System.out.println("Size - " + Character.BYTES + " bytes");
        System.out.println("Example -> gender = " + gender);

        //boolean
        boolean isAdult = true;
        data_type = printType(isAdult);
        System.out.println(data_type);
        System.out.println("Size - ~1 byte (JVM dependent)");
        System.out.println("Example -> isAdult = " + isAdult);

        //non primitive data types
        System.out.println("Below are non - primitive data types - ");
        String name = new String();
        name = "Ashish";
        String surname = "Wankhade";

        data_type = printType(name);
        System.out.println(data_type);

        //length
        System.out.println("string length - " + name.length());

        //concatenate
        String fullname = name + " " + surname;
        System.out.println("string concatenate - " + fullname);

        //charAt
        System.out.println("string character at - " + name.charAt(0));

        //replace
        System.out.println("string replace - " + name.replace('s', 't'));
        System.out.println("string immutable - " + name); //strings are immutable

        //substring
        System.out.println("string substring - " + fullname.substring(7,15));

        //Arrays
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 95;
//        marks[2] = 100;
        System.out.println(marks[2]);
    }

    static String printType(Object obj) {
        return obj.getClass().getSimpleName().toUpperCase();
    }
}
