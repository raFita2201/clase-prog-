import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{2,5,8,12,45};
        String[] palabras = new String[]{"palabra1","hola","adios","juego","programacion"};
       Arrays.sort(palabras, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               if (o1.length()>o2.length()){
                   return 1;
               } else if (o1.length()<o2.length()) {
                   return -1;
               }
               return 0;
           }
       });
        for (String item: palabras){
            System.out.println(item);
        }
        //Object[] persona = new Object[]{"Borja", 42, "borja@gmail.com"l, true, 'A'};
        //[null, null, null, null, null]
    }

}
