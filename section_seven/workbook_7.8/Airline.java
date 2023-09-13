public class Airline {
    
    Person[] people; //array that stores Person objects...

    public Airline(){
        this.people  = new Person[11];
    }


    public Person getPerson(int index){
        Person person =  this.people[index];
        return new Person(person);
    }


    public void setPerson(Person person){
        int seatNumber = person.getSeatNumber();

        this.people[seatNumber - 1] =  new Person(person);
    }
}
