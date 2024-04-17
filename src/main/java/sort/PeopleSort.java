package sort;

import java.util.Arrays;
import java.util.List;

public class PeopleSort {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("C", 3),
                new People("A", 1),
                new People("B", 2),
                new People("Z", 0)
        );
        System.out.println(people);
        people.sort(new SortByAgePeople());
        System.out.println(people);
        people.sort(new SortByNamePeople());
        System.out.println(people);
        people.sort(new SortDescByNamePeople());
        System.out.println(people);
    }

}
