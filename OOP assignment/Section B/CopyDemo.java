class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    public Student shallowCopy() {
        return new Student(this.name, this.address);
    }

    // Deep copy
    public Student deepCopy() {
        Address newAddress = new Address(this.address.city);
        return new Student(this.name, newAddress);
    }
}

public class CopyDemo {
    public static void main(String[] args) {
        Address addr1 = new Address("Delhi");
        Student s1 = new Student("Aman", addr1);

        Student shallow = s1.shallowCopy();
        Student deep = s1.deepCopy();

        // Change original object's address
        s1.address.city = "Mumbai";

        System.out.println("Original Student City: " + s1.address.city);
        System.out.println("Shallow Copy Student City: " + shallow.address.city);
        System.out.println("Deep Copy Student City: " + deep.address.city);
    }
}