package HashMaps;

import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {

        Map<String,Integer> nameNage = new HashMap<String,Integer>();

        nameNage.put("Rajive", 24);
        nameNage.put("Hasan",7);
        nameNage.put("Dev",17);
        nameNage.put("Pallab", 15);

        for (Map.Entry<String,Integer> en: nameNage.entrySet()) {
            System.out.println(en);
        }





    }

}

