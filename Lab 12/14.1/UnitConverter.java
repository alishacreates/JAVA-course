/*14.1 
Design a generic method-based unit converter that can:

* Convert values between different units (e.g., meters to kilometers, Celsius to Fahrenheit, kg to grams)
* Accept input in numeric form (any numeric type)
* Return the converted value */

public class UnitConverter {
    public static <T extends Number> double convert(T value, String fromUnit, String toUnit) {
        double val = value.doubleValue();

        if (fromUnit.equals("m") && toUnit.equals("km")) {
            return val / 1000;
        } else if (fromUnit.equals("km") && toUnit.equals("m")) {
            return val * 1000;
        }

        else if (fromUnit.equals("kg") && toUnit.equals("g")) {
            return val * 1000;
        } else if (fromUnit.equals("g") && toUnit.equals("kg")) {
            return val / 1000;
        }

        else if (fromUnit.equals("C") && toUnit.equals("F")) {
            return (val * 9/5) + 32;
        } else if (fromUnit.equals("F") && toUnit.equals("C")) {
            return (val - 32) * 5/9;
        }

        else {
            throw new IllegalArgumentException("Unsupported conversion");
        }
    }

    public static void main(String[] args) {
        System.out.println("Alisha, 590013908, b1");
        System.out.println(convert(1000, "m", "km"));   
        System.out.println(convert(2.5, "kg", "g"));    
        System.out.println(convert(25, "C", "F"));      
    }
}