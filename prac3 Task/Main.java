package prac3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main
{
    public static void main(String[] args) {
        MySafeMap<Integer,String> mySafeMap=new MySafeMap<>();

        mySafeMap.put(1,"Ali");
        mySafeMap.put(2,"Den");
        mySafeMap.put(3,"Stas");
        mySafeMap.put(4,"Artem");
        System.out.println(mySafeMap);
        System.out.println(mySafeMap.isEmpty());
        mySafeMap.remove(1,"Ali");
        System.out.println(mySafeMap);
        MySafeList<Integer> mySafeList=new MySafeList<>();
        mySafeList.add(1);
        mySafeList.add(2);
        mySafeList.add(3);
        mySafeList.add(4);
        for (int i = 0; i < mySafeList.size(); i++)
        {
            System.out.print(mySafeList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("------------");
        mySafeList.remove(3);
        for (int i = 0; i < mySafeList.size(); i++)
        {
            System.out.print(mySafeList.get(i) + " ");
        }
        mySafeList.clear();
        System.out.println("");
        System.out.println(mySafeList.isEmpty());
    }
}
