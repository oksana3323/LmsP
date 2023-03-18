import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        List<Group> groupList = new ArrayList<>();

        List<Lesson> lessonList = new ArrayList<>();

        GroupServices groupServices = new GroupServices();
        UserServices userServices = new UserServices();


        StudentServices studentServices = new StudentServices();
        Users users = new Users("oksana@gmail.com", "oksana");


        Group group = new Group();

        while (true) {

            try {
                System.out.println("0 баскычын басыныз");
                String email = scanner.nextLine();
                System.out.print(" email:");
                String email1 = scanner.nextLine();



                System.out.print("password : ");
                String password = scanner.nextLine();

                String yes = userServices.user(email, password, users);
                if (yes.equals("no")) {
                    throw new NullPointerException("Please write your email or password first");
                }
                if (yes.equals("yes")) {
                    while (true) {
                        System.out.println("""
                                 1  -> Add new group
                                 2  -> Get group by name
                                 3  -> Update group name
                                 4  -> Get all groups
                                 5  -> Add new student to group
                                 6  -> Update student
                                 7  -> Find student by first name
                                 8  -> Get all students by group name
                                 9  -> Get all student's lesson
                                 10 -> Delete lesson
                                 11 -> Add new lesson to group
                                 12 -> Get lesson by name
                                 13 -> Get all lesson by group name
                                 14 -> Delete student
                                 15 -> Delete group
                                """);

                        switch (scanner.nextInt()) {
                            case 1:
                                groupServices.AddNewGroup(groupList);
                                System.out.println(groupList + "  ");
                                break;
                            case 2:
                                String s = scanner.nextLine();
                                groupServices.GetGroupByName(groupList, scanner.nextLine());

                        }
                    }
                } else {
                    System.out.println("no");
                }
            } catch (NullPointerException e) {
                System.out.println(e);

            }
        }
    }
}