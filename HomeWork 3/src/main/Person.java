package main;

class Person {
    private String name;

    public Person() {
    }

    public Person(String theName) {
        name=theName;
    }

    public Person(Person theObject) {
    }

    public String getName() {
        return name;
    }

    public void setName(String theName) {
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object other) {
        Person n = (Person)other;
        return n.getName().equals(getName());

    }
}


