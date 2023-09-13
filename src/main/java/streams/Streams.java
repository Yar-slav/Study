package streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<UserTest> list = new ArrayList<>();
        list.add(new UserTest(1, "Karl", 13));
        list.add(new UserTest(2, "ANNA", 25));
        list.add(new UserTest(3, "MIKE", 11));
        list.add(new UserTest(4, "MIKE", 47));

        List<UserTest> list2 = new ArrayList<>();
        list2.add(new UserTest(6, "Karl", 13));
        list2.add(new UserTest(5, "ANNA", 25));
        list2.add(new UserTest(7, "MIKE", 11));
        list2.add(new UserTest(9, "MIKE", 47));

        list.stream()
                .forEach(System.out::println);

        Object o = Optional.empty().orElseThrow();
        System.out.println(o);
    }
}
