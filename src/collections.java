import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;

public class collections {

    public static void main(String[] args) {

        Collection<Integer> nums = Arrays.asList(4,5,6,7,8,9,0);


        //M1 : Long method with implementation of functional interface
        Consumer <Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        nums.forEach(consumer);


        //M2 : Lambda expressions
        Consumer <Integer> consumer1 = n -> System.out.println(n);
        nums.forEach(consumer1);

        //M3
        nums.forEach(System.out::println);

    }
}
