package ra.model;

import java.util.Scanner;
public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genere;
    public Singer() {
    }
    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genere) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genere = genere;
    }
    public int getSingerId() {
        return singerId;
    }
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }
    public String getSingerName() {
        return singerName;
    }
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationaliity(String nationality) {
        this.nationality = nationality;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======NHẬP THÔNG TIN CA SĨ======");
        System.out.println("Nhập mã ca sĩ: ");
        singerId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên ca sĩ: ");
        singerName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập quốc tịch: ");
        nationality = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập thể loại: ");
        genere = scanner.nextLine();
    }
    public void displayData() {
        System.out.println("======THÔNG TIN CA SĨ======");
        System.out.println("Mã ca sĩ: " + singerId);
        System.out.println("Tên ca sĩ: " + singerName);
        System.out.println("Tuổi: " + age);
        System.out.println("Quốc tịch: " + nationality);
        System.out.println("Giới tính: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Thể loại: " + genere);
    }
}