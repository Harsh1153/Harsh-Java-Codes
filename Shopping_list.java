//shopping list
//add items (if not already in it)
//delete items( on index after showing list)
//update item if needed
//print final list
import java.util.ArrayList;
import java.util.Scanner ;
 class Shopping_list {
    public static void main(String args[])
{
ArrayList<String> v=new ArrayList();
Scanner in =new Scanner(System.in);
int ch;
String item ;
do
{
    System.out.println("\nMy Shopping List\n1.Add Item"+ "\n2.Remove Item \n3.Display List \n4.Search Item\n5.Update Existing\n0.Exit\n:");
    ch=in.nextInt();
    switch(ch)
    {
        case 1:
                System.out.println("Enter Item:");
                item=in.next();
                if(v.contains(item))
                    System.out.println("Item:"+item+" already in list");
                else
                    v.add(item);
                break;
        case 2:
                 System.out.println("List has");
                 for (int i=0;i<v.size();i++)
                    System.out.println("Item: "+(i+1)+"-> "+v.get(i));
                System.out.println("Enter item number to delete:");
                int i =in.nextInt();
                if((i-1)< v.size())
                {
                    v.remove(i-1);
                    System.out.println("Item removed List is:\n"+v);
                }
               else
                System.out.println("Wrong Item Number:");
                break;
        case 3:

                for (i=0;i<v.size();i++)
                    System.out.println("Item: "+(i+1)+"-> "+v.get(i));
                break;
        case 4:
                System.out.println("Enter Item:");
                item=in.next();
                if(v.contains(item))
                    System.out.println("Item: "+item+" is at list number: "+(v.indexOf(item)+1));
                else
                    System.out.println("Item: "+item+" is not in the list");
                break;
        case 5:
                System.out.println("List has");
                for (i=0;i<v.size();i++)
                    System.out.println("Item: "+(i+1)+"-> "+v.get(i));
                System.out.println("Enter item number to update:");
                i =in.nextInt();
                if((i-1)< v.size())
                {
                    String temp=in.nextLine();

                    String newItem=in.nextLine();
                    v.set(i-1, newItem);
                    System.out.println("Item updated in List is:\n"+v);
                }
               else
                System.out.println("Wrong Item Number:");
                break;

        case 0:
                System.out.println("Exiting......");
                break;
        default:
                System.out.println("Wrong choice");
                break;
    }

}while(ch!=0);



}
}


