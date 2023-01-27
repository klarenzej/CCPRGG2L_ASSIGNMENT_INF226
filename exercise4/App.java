public class App {
    public static void main(String[] args) throws Exception {
        Person Me = new Person("Klarenze", 69);
        Person friend = new Person("Jeanne ", 19);
        Person classmate = new Person("Bianca" );
        Person classmate1 = new Person("Drei" );
        Person classmate2 = new Person("Josh" );
        Me.addFriend(friend);
        Pet Dog = new Pet("Bianca Redge arf arf", 3, Me);
        Dog.showOwner();
        Me.addClassmate(classmate);
        Me.addClassmate(classmate1);
        Me.addClassmate(classmate2);

        Car carOwn = new Car("Lambo", Me);
        carOwn.carOwner();
    }
}
