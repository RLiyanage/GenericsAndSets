package common;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;
    private Address address;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.lastName);
        hash = 19 * hash + Objects.hashCode(this.firstName);
        hash = 19 * hash + Objects.hashCode(this.ssn);
        hash = 19 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }


    
}
