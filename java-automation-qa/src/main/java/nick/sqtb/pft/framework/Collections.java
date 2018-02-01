package nick.sqtb.pft.framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
//        String[] langs = new String[4];
//        langs[0] = "Java";
//        langs[1] = "C#";
//        langs[2] = "Phyton";
//        langs[3] = "PHP";

        String[] langs = {"Java", "C#", "Phyton", "PHP"};

//        List<String> languages = new ArrayList<String>();
//        languages.add("JAVA");
//        languages.add("C#");
//        languages.add("Phyton");

        List<String> languages = Arrays.asList("Java", "C#", "Phyton", "PHP");


//        for (int i = 0; i < langs.length; i++) {
//            System.out.println("I want to learn " + langs[i]);
//        }

        for (String l : languages) {
            System.out.println("I want to learn " + l);
        }

    }
}
