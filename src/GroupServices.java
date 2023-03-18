import java.util.List;
import java.util.Scanner;
public class  GroupServices implements GroupInterface {

    int num = 1;

    @Override
    public void AddNewGroup(List<Group> groupList) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Группаныздын атын жазыныз");
        String name=scanner.nextLine();
        System.out.println("Муноздомосун жазыныз");
        String descriptions=scanner.nextLine();
        Group group=new Group(name,descriptions,num++);
        groupList.add(group);
    }

    @Override
    public void GetGroupByName(List<Group> groupList, String name) {
        System.out.println("Группанан аты мене групаны чакырынз");

       try {
         for (Group group : groupList) {
             if (group.getName().equalsIgnoreCase(name)) {
                 System.out.println(group);
             }

               throw new java.lang.Exception("Мындай група жок башынын 2 басыныз");

         }

     }catch (java.lang.Exception e) {
         System.out.println(e.getMessage());
     }

   }}
