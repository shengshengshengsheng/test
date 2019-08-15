package MyStackWithArrayList;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list=new ArrayList<>();
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public Object peek()
    {
        if(list.size()>0&&list!=null)
            return list.get(list.size()-1);
        return null;
    }
    public Object pop()
    {
        if(list.size()>0&&list!=null)
        {
            return list.remove(list.size()-1);
        }
        return null;
    }
    public void push(Object o)
    {
        list.add(o);
    }
    @Override
    public String toString()
    {
        return "stack"+list.toString();
    }


}
