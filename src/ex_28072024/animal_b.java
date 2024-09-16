package ex_28072024;

public class animal_b {
    String name = "ravi";
    String color = "red";


    void paly() {
    }

    void bark() {
    }

    public static void main(String[] args) {
// now if we do this, loding the class but not use new to create an object where
// defaut values are defined,
// BUT as we have used = null then the jVM will load the class and the default values will be assigned
        // but as we use null[null-> is a saperate area in JVM and the object reference name will get assigned to that null]

//        animal_b animalRef = null;
//        System.out.println(animalRef.color);
        // through the exception

        animal_b animalRef2 = new animal_b();
        animal_b animalRef3 = new animal_b();
        animal_b animalRef4 = animalRef2;
        System.out.println(animalRef4.color);

        // here we have used 3 reference values but the object created are two only
        // animalRef4 is just pointing towards the object of the animalRef2 only.



    }
}