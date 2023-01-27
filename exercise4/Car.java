public class Car {
    String name;
    Person owner;
    Car(String carName, Person ownerName){
        this.name = carName;
        this.owner = ownerName;
}
    void carOwner(){
        System.out.println("My name is "+ owner.name + ", my car is "+ this.name);
    }
    
}
