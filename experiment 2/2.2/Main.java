//2.2.  Write a Java program to input n numbers using command line arguments and print them in reverse order.
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        System.out.println("name: alisha, sap: 590013908, batch: 1(core) ");
        System.out.println("you entered:" + num1 +" "+ num2 +" "+ num3);
        System.out.println("in reverse: "+ num3 +" "+ num2 +" "+ num1);
    }
