import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        //отладка
        //String input = "Мама мыла-мыла-мыла раму!";
        String input ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes("UTF-8"));


        //отладка
        //Reader inRead = new InputStreamReader(System.in,"UTF-8");
        Reader inRead = new InputStreamReader(inputStream,"UTF-8");

        BufferedReader bf = new BufferedReader(inRead);




        String s = bf.readLine();
        Map<String, Long> words = Stream.of(s.split("[^A-Za-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(
                        Collectors.groupingBy(Object::toString,Collectors.counting()));
                //.distinct()
                //.sorted()
        for(String word:words.keySet()){
            System.out.println(word + " - " + words.get(word));
        }



       // words.putIfAbsent()



    }


}
