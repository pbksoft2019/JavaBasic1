public class JavaBasic {
    public static void remove() {      // this method removes letter s from string
        String sample = "This is very easy programme"; // sample string
        sample = sample.replace( "s", "" );
        System.out.print( "1) String without s will look like = " ); //// result description for printing sample length
        System.out.println( sample );  // print result for string sample
    }
    public static void findLength() { // this method created to find length of string
        String sample = "This is very easy programme"; // sample string
        System.out.print( "2) Lenght of string is = " ); // result description for printing sample length
        System.out.println( sample.length() ); //prints results for length of string
    }
    public static void removeSpace() { // method for removing space in string
        String sample = "This is very easy programme"; // sample string
        System.out.print( "3) String without space will look like = " ); // result description for printing string
        System.out.println( sample.replaceAll( "\\s", "" ) ); // print result string without space
    }
    public static void extractSpecialChar() { // method for extracting special characters from string
        String sample = "This $300 is equivalent of £200 but not for @100"; // sample string with special characters
        System.out.print( "4) Removing special Characters = " ); // result description for printing string
        System.out.println( sample.replaceAll( ("[^a-zA-Z0-9]"), "" ) );
    } //
    public static void extractNumber() { // method for extracting number from string
        String sample = "The cost of iPhone is £1,250"; // sample string to extract numbers
        System.out.print( "5) The cost of iPhone is " ); // result description for printing string
        //printing result for extracting number from string
        System.out.println( sample.replaceAll( "[^0-9]", "" ) );
    }
    public static void intToNumber() { // method for integer to bouble
        int sample = 450; // sample integer
        System.out.print( "6) value of integer to number is = " ); //result description for printing string
        System.out.println( (double) (sample) );
    }
    public static void stringToInt() { // method created to convert String value to Integer
        String sample = "125"; // Sample String
        System.out.print( "7) String value to integer will be " ); // result description for printing string
        System.out.println( Integer.parseInt( sample ) ); //Result for String to integer
    }
    public static void doubleToString() { // method created to convert double value to String
        double sample = 123.45; // sample value for double
        System.out.print( "8) Value from Double to String will be " );  //result description for printing string
        System.out.println( sample );  // print Result for double to string
    }
    public static void stringToDouble() { // this method will convert string value to double
        String sample = "560.25"; // sample String
        Double value = Double.parseDouble( sample );
        System.out.print( "9) Value from String to Double is = " ); // result description for printing string
        System.out.println( value ); // print result for string to double
    }
    public static void divisionInDecimal(double x, double y) { //method to get answer in decimal value
        String value1 = "1";
        String value2 = "3";
        System.out.print( "10) Division of 1/3 in decimal will be = " ); //result description for printing string
        System.out.println( Double.parseDouble( value1 ) + Double.parseDouble( value2 ) ); // print result in decimal value
    }
    public static void replaceCurrencySymbol() {
        String sample = "$250.00";
        System.out.print( "11) When currency symbol replaced from $ to £ is = " ); // result description for printing string
        System.out.println( sample.replace( "$", "£" ) ); // print result with replacement currency symbol
    }
    public static void extractFromMiddle(String x) { // this method will extract middle character from string
        int position;
        int length;
        if ((x.length() % 2) == 1) {
            position = x.length() / 2;
            length = 1;
        } else
            { position = x.length() / 2 - 1;
            length = 2;   }

        String result = x.substring( position, position + length );
        // result description for printing string
        System.out.println( "13) Middle character of string is = " + result );      }

    public static void main(String[] args) {
        remove(); // method from inside class
        findLength(); // method from inside class
        removeSpace(); // method from inside class
        extractSpecialChar(); // method from inside class
        extractNumber(); // method from inside class
        intToNumber(); // method from inside class
        stringToInt(); // method from inside class
        doubleToString(); // method from inside class
        stringToDouble(); // method from inside class
        divisionInDecimal( 1, 3 ); // method from inside class with using parameter
        replaceCurrencySymbol(); // method from inside class
        extractFromMiddle( "Orange" ); // method from inside class with using parameter
        extractFromMiddle( "There" ); // method from inside class with using parameter
        extractFromMiddle( "England" ); // method from inside class with using parameter
    }
}