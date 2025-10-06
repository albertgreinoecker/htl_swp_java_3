package at.ac.htlinn.streams;

import java.io.*;

//Unsere Klasse muss Serializable implementieren
class Person implements Serializable {
 private static final long serialVersionUID = 1L; // empfohlen
 String name;
 int alter;

 public Person(String name, int alter) {
     this.name = name;
     this.alter = alter;
 }

 @Override
 public String toString() {
     return "Person{name='" + name + "', alter=" + alter + "}";
 }
}

public class ObjectOutputStreamDemo {
 public static void main(String[] args) {
     String datei = "person.ser";

     // Objekt in Datei schreiben (Serialisierung)
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datei))) {
         Person p1 = new Person("Max Mustermann", 25);
         oos.writeObject(p1);
         System.out.println("Objekt geschrieben: " + p1);
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Objekt aus Datei lesen (Deserialisierung)
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datei))) {
         Person p2 = (Person) ois.readObject();
         System.out.println("Objekt gelesen: " + p2);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
