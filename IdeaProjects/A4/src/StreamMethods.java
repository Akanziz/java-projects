import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamMethods {
    static List<String> removeLonger(List<String> los, int n) {
        List <String> los2 = los.stream().
                filter(s -> s.length() <= n).
                collect(Collectors.toList());
        return los2;
    }

    static List<Integer> sqAddFiveOmit(List<Integer> lon){
        List<Integer> collect = lon.stream()
                .map(w -> w * w + 5)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
        return collect;
    }

    static Map<Integer, Integer> groupLength(List<String> los){
        return los.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.summingInt(s -> 1)));
    }
}
