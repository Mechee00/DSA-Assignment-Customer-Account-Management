package entity;

public class Customer {
    private String userName;
    private String password;
    private String email;
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;
    private String address;

    // Constructor
    public Customer() {
    }

    public Customer(String userName, String password, String email, String name, char gender, int age,
            String phoneNumber,
            String address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter Setter
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "+++++++++++++++++++++++++++++++++ User Detail\n" +
                "User Name: '" + getUserName() + "'\n" +
                "Password: '" + getPassword() + "'\n" +
                "Email: '" + getEmail() + "'\n" +
                "Name: '" + getName() + "'\n" +
                "Gender: '" + getGender() + "'\n" +
                "Age: '" + getAge() + "'\n" +
                "Phone Number: '" + getPhoneNumber() + "'\n" +
                "Address: '" + getAddress() + "'\n" +
                "+++++++++++++++++++++++++++++++++ User Detail\n";
    }

    public void clear() {
        this.userName = null;
        this.password = null;
        this.email = null;
        this.name = null;
        this.gender = '\u0000';
        this.age = 0;
        this.phoneNumber = null;
        this.address = null;
    }

}