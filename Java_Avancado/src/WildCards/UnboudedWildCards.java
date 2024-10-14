package WildCards;
import java.util.Arrays;
import  java.util.List;

public class UnboudedWildCards {

    /**
     * Evite usar Unbouded pois aceita tudo! Seja double, String, double...
     * Opte por usar Lower ou Upper
     * @param list
     */
    public static void printList(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,6,78);
        List<Double> doubles = Arrays.asList(2.5,2.6,1.0);
        List<Number> numbers = Arrays.asList(22,11,2.0);

    }
}
