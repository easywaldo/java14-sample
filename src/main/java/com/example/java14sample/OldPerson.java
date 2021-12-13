package com.example.java14sample;

import java.util.Objects;

public class OldPerson {
    private final String name;
    public String getName() {
        return this.name;
    }
    private final String address;
    public String getAddress() {
        return this.address;
    }

    public OldPerson(String name,
                     String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (!(obj instanceof OldPerson)) {
            return false;
        }
        else {
            OldPerson other = (OldPerson) obj;
            return Objects.equals(name, other.name) && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }



}
