import java.io.*;
import java.util.Scanner;

public class Main {


    // Task 2 - Write Person to file1.txt using FileWriter
    // TODO 4: Add a static method textFileWrite() that returns void
    // TODO 5: Create Person object
    // TODO 6-7: Write to file using FileWriter in try-catch
    // TODO: Print message "File written with FileWriter..."

    public static void textFileWriter() {
        Person person = new Person("Ingrid", 43, 78.9);

        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write(person.toString());
            fileWriter.close();

            System.out.println("File written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //  Task 3 - Write user input to file2.txt using PrintWriter
    // TODO 8: Define a static method printWrite() that returns void
    // TODO 9: Take input using Scanner
    // TODO 10: Create Person object
    // TODO 11-12: Write to file using PrintWriter in try-catch
    // TODO: Print message "File written with PrintWriter..."

    public static void printWrite(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();

        Person person = new Person(name, age, weight);

        try {
            PrintWriter printWriter = new PrintWriter("file2.txt");
            printWriter.write(person.toString());
            printWriter.close();

            System.out.println("File written successfully");
        }catch (IOException e){

            e.printStackTrace();
        }
    }


    // Task 4 - Write byte array to binary file3.dat using FileOutputStream
    // TODO 13: Define a static method writeBinaryNumbers() that returns void
    // TODO 14: Declare byte array
    // TODO 15-17: Write bytes using FileOutputStream in try-catch
    // TODO: Print message "File written with FileOutputStream..."


    public static void writeBinaryNumber(){


        byte[] binaryNumber = {17,14,11,7,1};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file3.dat");
            for(byte b : binaryNumber){

                fileOutputStream.write(b);
            }
            fileOutputStream.close();
            System.out.println("File written successfully");
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    // Task 5 - Write Person object to binary file4.dat using DataOutputStream
    //TODO 18: Define a static method writePersonBinary() that returns void
    // TODO 19: Read input using Scanner
    // TODO 20: Create Person object
    // TODO 21-23: Write attributes using DataOutputStream in try-catch
    // TODO: Print message "File written with DataOutputStream..."

    public static void writePersonBinary(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your weight:");
        double weight = sc.nextDouble();

        Person person = new Person(name, age, weight);

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("file4.dat"));
//            dataOutputStream.writeUTF(person.toString());
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeInt(age);
            dataOutputStream.writeDouble(weight);
            dataOutputStream.close();

            System.out.println("File written successfully");


        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        textFileWriter();
        printWrite();
        writeBinaryNumber();
        writePersonBinary();


    }


}