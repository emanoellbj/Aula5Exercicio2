import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
        List<String> strings = new ArrayList<>();
        strings.add("maça");
        strings.add("banana");
        strings.add("maça");
        strings.add("cereja");
        strings.add("banana");

        Map<String, Integer> ocorrencias = countOccurrences(strings);
        System.out.println(ocorrencias);
	}
	
    public static Map<String, Integer> countOccurrences(List<String> strings) {
        Map<String, Integer> ocorrencias = new HashMap<>();

        for (String str : strings) {
        	ocorrencias.put(str, ocorrencias.getOrDefault(str, 0) + 1);
        }

        return ocorrencias;
    }
}
