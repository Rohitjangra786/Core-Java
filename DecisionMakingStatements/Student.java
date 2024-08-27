public class Student {
    String firstName;
    String lastName;
    int PIN;
    String phoneNumber;
    String countryCode;
    String password;
    String email;
    String profilePicture;
    String bio;
    int friendCount;

    public Student(String firstName) {
        this.firstName = firstName;
        
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student( int PIN) {
        this.PIN = PIN;
    }

    public Student(String firstName, String lastName, int PIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
    }

    public Student(String firstName, String lastName, int PIN, String phoneNumber, 
    String countryCode, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.password = password;
        
    }
    
    public Student(String firstName, String lastName, int PIN, String phoneNumber, 
        String countryCode, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.password = password;
        this.email = email;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPIN() {
        return PIN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getBio() {
        return bio;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rohit", "Kumar", 123, "7015204440", 
        "India", "password123", "rjangra696@.com" );

        System.out.println("First Name: " + student1.firstName);
        System.out.println("Last Name: " + student1.lastName);
        System.out.println("Roll No.: " + student1.PIN);
        System.out.println("Phone Number: " + student1.phoneNumber);
        System.out.println("Country Code: " + student1.countryCode);
        System.out.println("Password: " + student1.password);
        System.out.println("Email: " + student1.email);
        
        System.out.println(" Hello, Facebook!");


    }
}