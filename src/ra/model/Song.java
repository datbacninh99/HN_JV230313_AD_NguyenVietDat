package ra.model;

import java.util.Date;
import java.util.Scanner;
public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;
    public Song() {
    }
    public Song(String songId, String songName, String descriptions, String singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }
    public String getSongId() {
        return songId;
    }
    public void setSongId(String songId) {
        this.songId = songId;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getSongWriter() {
        return songWriter;
    }
    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public boolean isSongStatus() {
        return songStatus;
    }
    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }
    public void inputData(Singer[] singers, int singerCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======NHẬP THÔNG TIN BÀI HÁT======");
        System.out.print("Nhập mã bài hát : ");
        songId = scanner.nextLine();
        System.out.print("Nhập tên bài hát: ");
        songName = scanner.nextLine();
        System.out.print("Nhập mô tả bài hát: ");
        descriptions = scanner.nextLine();
        System.out.println("Danh sách ca sĩ:");
        System.out.print("Chọn mã ca sĩ: ");
        String singerId = scanner.nextLine();
        System.out.print("Nhập tên người sáng tác: ");
        songWriter = scanner.nextLine();
    }
    public void displayData() {
        System.out.println("======THÔNG TIN BÀI HÁT======");
        System.out.println("Mã bài hát: " + songId);
        System.out.println("Tên bài hát: " + songName);
        System.out.println("Mô tả bài hát: " + descriptions);
        if (singer != null) {
            System.out.println("Ca sĩ: " + singer.intern());
        } else {
            System.out.println("Ca sĩ: Chưa xác định");
        }
        System.out.println("Người sáng tác: " + songWriter);
        System.out.println("Ngày tạo: " + createdDate);
        System.out.println("Trạng thái: " + (songStatus ? "Hoạt động" : "Ngừng hoạt động"));
    }
}