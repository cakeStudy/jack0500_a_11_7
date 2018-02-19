import java.util.ArrayList;
import java.util.Collections;

public class ch11_7a
{
    /*Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
    that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if one list contains
    the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains
    the values [–5, 15, 2, –1, 7, 15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.*/

    public void run()
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(-5);
        list2.add(15);
        list2.add(2);
        list2.add(-1);
        list2.add(7);
        list2.add(15);
        list2.add(36);

        System.out.println(countCommon(list1, list2));
    }

    public Integer countCommon(ArrayList<Integer> list1, ArrayList list2)
    {
        Integer commonCount = 0;
        if (list1.size() == 0 || list2.size() == 0)
        {
            return commonCount;
        }else
        {
            try
            {
                removeDoubles(list1);

                for (Integer integer: list1)
                {
                    if (list2.contains(integer) == true)
                    {
                        commonCount++;
                    }
                }
            }catch (IndexOutOfBoundsException IOOBe)
            {
                return commonCount;
            }
        }
        return commonCount;
    }

    public ArrayList<Integer> removeDoubles(ArrayList<Integer> list)
    {
            //sorts the list
            Collections.sort(list);
            int slutIndex = list.size();
            try
            {
                for (int i = 0; i < slutIndex; i++)
                {
                    if (list.get(i) == list.get(i + 1))
                    {
                        list.remove(i);
                        i--;
                        slutIndex--;
                    }
                }
            }catch (IndexOutOfBoundsException IOOBe)
            {
                return list;
            }
        return list;
    }
}
