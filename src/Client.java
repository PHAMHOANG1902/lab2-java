public class Client {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Thu", true);
        Student student2 = new Student(2, "Anh", false);
        student1.prinInfo();
        student2.prinInfo();

        student2.setName("EM");
        student2.prinInfo();

    }

}
