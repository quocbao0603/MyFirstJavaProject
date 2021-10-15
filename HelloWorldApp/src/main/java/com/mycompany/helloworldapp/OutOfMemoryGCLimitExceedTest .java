import java.util.*;
public class OutOfMemoryGCLimitExceedTest { 

    public static void addRandomDataToMap() { 

        Map<Integer, String> dataMap = new HashMap<>(); 

        Random r = new Random(); 

        while (true) { 

            dataMap.put(r.nextInt(), String.valueOf(r.nextInt())); 

        } 

    } 

} 