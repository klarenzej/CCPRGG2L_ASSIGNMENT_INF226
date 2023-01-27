public class Pet {
    String name;
    int age;
    Person owner;

    Pet(String petName, int petAge, Person ownerName){
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
}
    void showOwner(){
        System.out.println("My name is "+ this.name + ", my owner is "+ owner.name);
    }
}
