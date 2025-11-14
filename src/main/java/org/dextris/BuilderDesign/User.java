package org.dextris.BuilderDesign;

public class User {

    private String firstName;
    private String lastName;

    private int age;
    private String profession;

    private User(Builder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
    }

    public static class Builder{
        private String firstName;
        private String lastName;

        private int age;
        private String profession;

        public Builder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder profession(String profession){
            this.profession=profession;
            return this;
        }

        public User build() {
            return new User(this
            );
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
