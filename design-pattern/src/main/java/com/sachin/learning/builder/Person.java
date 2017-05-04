package com.sachin.learning.builder;

/**
 * http://www.importnew.com/6605.html
 *
 * @author shicheng.zhang
 * @since 17-5-4 下午4:33
 */
public class Person {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String street;
    private final String city;
    private final String state;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Person(String lastName, String firstName, String middleName, String street, String city, String state) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private String street;
        private String city;
        private String state;

        public PersonBuilder() {
        }

        public PersonBuilder(String lastName, String middleName, String firstName) {
            this.lastName = lastName;
            this.middleName = middleName;
            this.firstName = firstName;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder street(String street) {
            this.street = street;
            return this;
        }

        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        public Person build() {
            return new Person(lastName, firstName, middleName, street, city, state);
        }
    }
}
