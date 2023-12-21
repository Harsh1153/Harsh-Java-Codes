
class Item {
    static int count;

    Item() {
        count++; //constructor
        System.out.println("Count is:" + count);
    }
    static void total()
    {
        System.out.println("Total population:"+Item.count);
    }
}

public class StaticMembership
{
    public static void main(String args[])
    {
       Item i1=new Item();
        Item i2=new Item();
        Item i3=new Item();
        Item i4=new Item();
        Item i5=new Item();
        Item.total();

    }
}




