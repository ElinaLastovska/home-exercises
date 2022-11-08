package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        List<String> listOfWord = new ArrayList<>();
        listOfWord.add("word");
        System.out.println(concatenate(listOfWord));

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        System.out.println(concatenate(listOfInteger));

        Object a = new Object();
        List<Object> listOfObject = new ArrayList<>();
        listOfObject.add(a);
        System.out.println(concatenate(listOfObject));

    }

    public static <T> String concatenate(List<T/*T/?*/> list) {
        StringBuilder result = new StringBuilder();
        String separator = "";
        if (list.get(0) instanceof String) {
            result = new StringBuilder("String:");
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = new StringBuilder("Integers:");
            separator = "+";
        }
        for (T el : list)
            result.append(separator).append(el.toString());
        return result.toString();
    }


}
/*
 * Pietrūkst public static. Un pirms atgriežamā tipa ir jānorāda <T>, lai programma zin ka ir generic tips <T>
 * Nevar izmantot instanceof kā piemērā - list instanceof List<String>. Jo nevar salīdzināt - we can't use instanceof along with erased generic types. (nemāku iztulkot lai skanētu pareizi.)
 * list instanceof String ar nevar salīdzināt jo nevar salīdzināt vai sarakstu ar string tipu. tāpēc jāizmanto kā saraksta objektu un tas jāsalīdzina vai ir String - list.get(0)
 * foreach ciklā izmantot labāk generic type T nevisw Object, jo ja izmanto Object tad programma izturās kā pret objektu. bet ja ir generic type T, tad izturas kā pret to tipu kas tiek padots.

 * list of strings containing only one element "word"? --Liekas ka viss labi.
 * list of Integers containing only one element Integer(1)? --Liekas ka viss labi.
 * list of Objects containing only one element (initialized by new Object())? -- objektu neatpazīst, jo tāds nav nodefinēts.
 *
 * liekas ka viss strādā kā paredzēts un neko uzlabot vairs nevajag :)
 * Labāk izmantot StrinBuilder - "use StringBuilder to gain performance."
 *
 * ja izmantotu "method overloading" tad būtu daudz kopēts kods, kas nav vajadzīgs.
 */