import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Creating list
        List<Integer> list = new ArrayList<>();

//        add element
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);

//        get element
        System.out.println(list.get(2));

//        get size
        System.out.println(list.size());

//        iterate data
        for(Integer i: list){
            System.out.println(i);
        }

//        check element
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));

//        remove element
        list.remove(2);
        list.remove(Integer.valueOf(5));

//        list size
        System.out.println(list.size());

//        add at an index
        list.add(1, 10);
//        addAll(list) -> to add content of a list in an existing list

//        replace element
        list.set(2, 1);

//        convert into the array
        Integer[] numbers = list.toArray(new Integer[0]);

//        sort()
        Arrays.sort(numbers);       // to sort array
        Collections.sort(list);     // to sort list

//        list using asList -> fixed size ArrayList
        List<String> name = Arrays.asList("Suraj", "Ronit", "Monit");
        String[] names = {"Suraj", "Ronit", "Monit"};
        List<String> nameList = Arrays.asList(names);

//        throw exception when try to extends
//        name.add("Ram");
//        nameList.add("Shyam");

//        list using List.of() -> unmodifiable list
        List<Integer> num = List.of(1, 5, 2, 3, 9);

//        this can modifiable
        List<Integer> convertedList = new ArrayList<>(num);
        convertedList.add(50);
        System.out.println(convertedList);

//        print list -> automatically converted into string
        System.out.println(num);

    }
}
