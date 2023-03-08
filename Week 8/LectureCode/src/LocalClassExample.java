import java.util.Comparator;
import java.util.List;

public class LocalClassExample {
    void sortName(List<String> names) {
        class NameComparator implements Comparator<String> {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        }

        names.sort(new NameComparator());
    }
}
