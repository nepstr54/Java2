import java.util.*;

import static GB_OOPnaJAVA.less02.DZ.NootbookClass.Filter;

public class Main {
    public static void main(String[] args) {
        Filter(notebooks());
    }

    private static Set<NootbookClass> notebooks() {
        NootbookClass obj1 = new NootbookClass(0, "2", "128", "4", "Windows10", "black", "Irbis");
        NootbookClass obj2 = new NootbookClass(1, "2", "128", "4", "Windows11", "silver", "DEXP");
        NootbookClass obj3 = new NootbookClass(2, "4", "128", "4", "Windows10", "silver", "Irbis");
        NootbookClass obj4 = new NootbookClass(3, "2", "1000", "4", "none", "silver", "HP");
        NootbookClass obj5 = new NootbookClass(4, "2", "128", "4", "Windows11", "black", "Irbis");
        NootbookClass obj6 = new NootbookClass(5, "4", "128", "4", "Windows11", "black", "Irbis");
        NootbookClass obj7 = new NootbookClass(6, "6", "2000", "16", "Windows11", "black", "Irbis");
        NootbookClass obj8 = new NootbookClass(7, "2", "128", "4", "Windows11", "black", "Irbis");
        return new HashSet<>(List.of(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8));
    }
}
