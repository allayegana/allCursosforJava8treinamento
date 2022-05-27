import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class cursosDeTrainamento {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("Allaye");
        palavras.add("Mariam");
        palavras.add("Abdoul");
        palavras.add("Adama");
        palavras.add("yaya");

//        for (String liste : palavras){
//            System.out.println(liste);
//        }


        // palavras.forEach(s -> System.out.println(s,sort));

        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
    }
}
