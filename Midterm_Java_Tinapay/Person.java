class Person {

    private String name;
    private String address;
    private int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}