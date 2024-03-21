public class Student {
    private int id;
    private String name;
    private boolean gender;

    public Student() {
        this.id =1;
        this.name = "";
        this.gender = true;
    }
    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public boolean isMale(){
        return this.gender;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setMale(boolean male) {
        this.gender= male;
    }
    public void setName(String name){
        this.name = name;
    }
    public void prinInfo() {
        System.out.println("----------");
        System.out.printf("%d %s %b \n", this.id, this.name, this.gender);
    }


}