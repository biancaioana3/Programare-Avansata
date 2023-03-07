import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person>, Node {
    private String name;
    private int age;
    private String address;
    private Set<Person> friends;

    /**
     *
     * @param name is person name
     * @param age is persone age
     * @param address is person address
     * friends is a list for the friends of person
     */

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        friends = new HashSet<>();
    }

    public void addFriend(Person person) {
        friends.add(person);
        person.friends.add(this);
    }

    public Set<Person> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
/**
 * @compareTo return 0 if the person objects are equal
 */

}
