package explorefeatures;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CodeTest {
    private String fish;
    public static void main(String[] args) {
        System.out.println(Optional.of("value").orElse(null));
        System.out.println(Optional.empty().map(null).orElse("value"));
    }

    private static void elementsList() {
        List<String> elementList = new ArrayList<>(Arrays.asList("elem1", "elem2", "elem3"));
        elementList.stream().forEach(elem -> {
            System.out.println(elem);
            if(Objects.nonNull(elem) && elem.equals("elem2")){
                elementList.remove(elem);
            }
        });
    }

    private void supplier() {
        fish = "fish";
        Supplier<String> fishSupplier = fish::toUpperCase;
        Supplier<String> fishSupplier2 = () -> fish.toUpperCase();

        fish = "animal";
        System.out.println(fishSupplier.get());
        System.out.println(fishSupplier2.get());
    }

    private static void executors() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<String> list = Collections.singletonList("Word");

        service.submit(()-> Files.write(Paths.get("file.txt"), list));
        service.submit(()-> {
            try {
                Files.write(Paths.get("file2.txt"),list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void spliterators() {
        boolean caseOne = Spliterators.emptyIntSpliterator() == Spliterators.emptyIntSpliterator();
        boolean caseTwo = Stream.empty() == Stream.empty();
        System.out.println(caseOne + "/" + caseTwo);
    }

    private static void reflection() {
        final Integer a = 1;
        try {
            Field valField = a.getClass().getDeclaredField("value");
            valField.setAccessible(true);
            valField.setInt(a,2);

            Integer b = 1;
            Integer c = 1;

            System.out.println(b + c);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void maxNumberWithStreams() {
        System.out.println(Stream.of(-3,-2,-1,0,1,2,3).max(Math::max).get());
        System.out.println(Stream.of(-3,-2).max(Math::max).get());
        System.out.println(Stream.of(-3,3).max(Math::max).get());
        System.out.println(Stream.of(0,1,2,3).max(Math::max).get());
        System.out.println(Stream.of(-3,-2,-1,0,1).max(Math::max).get());
    }
}
