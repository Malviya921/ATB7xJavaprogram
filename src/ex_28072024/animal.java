package ex_28072024;

public class animal {
    String name;
    String color;


    void paly(){}
    void bark(){}

    public static void main(String[] args) {
        // we are defining/giving the values and creating the new object
//        animal kutta = new animal();
//        kutta.name = "bhobho";
//        kutta.color = "totiya";
//        System.out.println(kutta.name);





   // now if we do this, loding the class to create an object where defaut values are not defined
        // so it will show null for string and 0 for int etc....
        animal animalRef= new animal();
        System.out.println(animalRef.color);







    }









}
