/**
 * Created by Candy on 28.07.2016.
 */
public class Person {

    private String name;
    private int age;
    private String gender;
    int a;
    private String foo;



    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                name + ", age: " + age + ", gender: " + gender +",";

    }

}
