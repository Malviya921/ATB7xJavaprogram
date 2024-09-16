package ex_28072024;

public class lab154 {
    public static void main(String[] args) {
        // oosp -is a concept
        // real life problem  we can solve them using oops concept
        // suppose we are creating a new planet
        //AHuman
        // every object (in this case human) will have
        // Attribute/ PROPERTIES -> 2 hand , 2 eyes , nose, mouth ,height, weight, body color
        //Behaviour(functionality)/ METHOD -> walk(), eat(), talk(), read(), sleep(), hear()

        // using these blue-print we can create a real AHuman
        // new human -> Amit
        // which have attribute -> A
        // which have BEHAVIOUR -  > B


        // here the blueprint is not real human being but
        // if we create a human using those attribute that will be a real human/object


        // A--> any blueprint is called as -> CLASS. here we have created person(a class[public])
        // B--> Real thing is called as -> OBJECT.
        // now let's create an object using the person class

        Person person = new Person();
        person.name = "ravi";
        person.roll_no = 69 ;

        Person person2 = new Person();
        person2.name = "ravi";
        person2.roll_no = 69 ;



    }
}
