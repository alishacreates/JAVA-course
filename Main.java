class Animal {
void sound() {
System.out.println("Animal makes sound");
}
}
class Dog extends Animal {
void sound() {
System.out.println("Dog barks");
}
}
Animal a = new Dog();
a.sound(); // Output: Dog barks (runtime decision)