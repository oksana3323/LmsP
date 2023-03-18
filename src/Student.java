public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Gender gender;
    private Group group;
    private Lesson lesson;
    private int id;

    public Student(String firstName, String lastName, String email, String password, Gender gender, Group group, Lesson lesson, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.group = group;
        this.lesson = lesson;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student" +
                "  firstName:" + firstName +
                "  lastName:" + lastName +
                "  email:" + email +
                "  password:" + password +
                "  gender:" + gender +
                "   group:" + group +
                "  lesson:" + lesson +
                "  id:" + id;
    }
}
