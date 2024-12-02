package OOP;

public class ToStringJava {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ToStringJava(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public String toString() {


        String result = "Olá, meu nome é "+ getName() +" e tenho "+ getAge()+ " anos de idade";
        String result2 = "Olá, meu nome é "+ name +" e tenho "+ age + " anos de idade";

        return result;

    }
}
