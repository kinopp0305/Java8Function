package compare;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

/**
 * 年齢、名前順のソート例
 * @author kinopp
 */
public class Compare {

    /**
     * ソート結果を表示する
     * @param message 表示のタイトル
     * @param people 表示対象のリスト
     */
    public static void printPeople(final String message, final List<_Person> people) {
            System.out.println(message);
            people.forEach(System.out::println);
    }
  
    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {
        final List<_Person> people = Arrays.asList(
            new _Person("John", 20),
            new _Person("Sara", 21),
            new _Person("Jane", 21),
            new _Person("Greg", 35)
        );

        {  
            System.out.println("//" + "START:年齢の昇順で出力");
            List<_Person> ascendingAge = 
              people.stream()
                    .sorted((person1, person2) -> person1.ageDifference(person2))
                    .collect(toList());
            printPeople("Sorted in ascending order by age: ", ascendingAge);
        }

        {  
            System.out.println("//" + "START:年齢の昇順で出力（メソッド参照）");
            List<_Person> ascendingAge = 
              people.stream()
                    .sorted(_Person::ageDifference)
                    .collect(toList());
            printPeople("Sorted in ascending order by age: ", ascendingAge);
        }

        {
            System.out.println("//" + "START:年齢の降順で出力");
            printPeople("Sorted in descending order by age: ",
              people.stream()
                    .sorted((person1, person2) -> person2.ageDifference(person1))
                    .collect(toList()));

            System.out.println("//" + "START:年齢の昇順と降順で出力(reversed使用)");
            Comparator<_Person> compareAscending = 
                    (person1, person2) -> person1.ageDifference(person2);
            Comparator<_Person> compareDescending = compareAscending.reversed();

            printPeople("Sorted in ascending order by age: ",
              people.stream()
                    .sorted(compareAscending)
                    .collect(toList())
            );
            printPeople("Sorted in descending order by age: ",
              people.stream()
                    .sorted(compareDescending)
                    .collect(toList())
            );

            System.out.println("//" + "START:名前の昇順と降順で出力");
            printPeople("Sorted in ascending order by name: ",
              people.stream()
                    .sorted((person1, person2) -> 
                       person1.getName().compareTo(person2.getName()))
                    .collect(toList()));
        }

        {
            System.out.println("//" + "START:最年少を出力");
            people.stream()
                  .min(_Person::ageDifference)
                  .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
        }

        {
            System.out.println("//" + "START:最年長を出力");
            people.stream()
                  .max(_Person::ageDifference)
                  .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
        }

        {
            people.stream()
                  .sorted((person1, person2) -> 
                     person1.getName().compareTo(person2.getName()));

            printPeople("Sorted in ascending order by name: ",
              people.stream()
                    .sorted(comparing((_Person person) -> person.getName()))
                    .collect(toList()));

            final Function<_Person, String> byName = person -> person.getName();
            people.stream()
                  .sorted(comparing(byName));
        }

        {
            System.out.println("//" + "START:年齢＋名前の昇順に出力");

            final Function<_Person, Integer> byAge = person -> person.getAge();
            final Function<_Person, String> byTheirName = person -> person.getName();

            printPeople("Sorted in ascending order by age and name: ",
              people.stream()
                    .sorted(comparing(byAge).thenComparing(byTheirName))
                    .collect(toList()));
        }
    }
}
