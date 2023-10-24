package homeworkweek7;

public class Person {
    //Declaring instance Variable
    String firstName;
    String lastName;
    int age;

    public String getFirstName() { //Declaring instance method without Parameters
        return firstName;
    }

    public String getLastName() { //Declaring instance method without Parameters
        return lastName;
    }

    public int getAge() { //Declaring instance method without Parameter
        return age;
    }

    public void setFirstName(String firstName) { //Declaring instance method with Parameter
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { //Declaring instance method with Parameter
        this.lastName = lastName;
    }

    public void setAge(int age) {//Declaring instance method with Parameter
        this.age = age;
        if (age > 0 || age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() { //Declaring instance method with Parameter
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() { //Declaring instance method with Parameter
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) { //Declaring main method
        Person person = new Person(); //Object created for calling instance method in to main method
        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(10);
        System.out.println("fullName= " + person.isTeen());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
}


