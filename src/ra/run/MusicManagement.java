package ra.run;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singer[] singers = new Singer[100];
        Song[] songs = new Song[100];
        int singerCount = 0;
        int songCount = 0;

        do {
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    singerManagement(singers, singerCount);
                    break;
                case 2:
                    songManagement(songs, singers, songCount, singerCount);
                    break;
                case 3:
                    searchManagement(songs, singers, songCount, singerCount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời bạn chọn lại!");
            }
        } while(true);
    }

    public static void singerManagement(Singer[] singers, int singerCount) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1. Nhập và thêm ca sĩ mới");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ");
            System.out.println("3. Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4. Xóa ca sĩ theo mã id");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    singers[singerCount] = new Singer();
                    singers[singerCount].inputData();
                    singerCount++;
                    break;
                case 2:
                    System.out.println("Danh sách tất cả ca sĩ:");
                    for(int i = 0; i < singerCount; i++) {
                        singers[i].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã ca sĩ cần thay đổi thông tin: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < singerCount; i++) {
                        if(singers[i].getSingerId() == id) {
                            System.out.println("Nhập thông tin mới cho ca sĩ có mã " + id);
                            singers[i].inputData();
                            System.out.println("Thay đổi thông tin ca sĩ thành công.");
                            return;
                        }
                    }
                    System.out.println("Không tìm thấy ca sĩ có mã " + id);
                    break;
                case 4:
                    System.out.println("Nhập mã ca sĩ cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < singerCount; i++) {
                        if(singers[i].getSingerId() == id) {
                            System.out.println("Xóa ca sĩ " + singers[i].getSingerId() + " thành công.");
                            for(int j = i; j < singerCount - 1; j++) {
                                singers[j] = singers[j + 1];
                            }
                            singerCount--;
                        }
                    }
                    System.out.println("Không tìm thấy ca sĩ có mã " + id);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời bạn chọn lại!");
            }
        } while(true);
    }

    public static void songManagement(Song[] songs, Singer[] singers, int songCount, int singerCount) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********************SONG-MANAGEMENT*************************");
            System.out.println("1. Nhập và thêm bài hát mới");
            System.out.println("2. Hiển thị danh sách tất cả bài hát");
            System.out.println("3. Thay đổi thông tin bài hát theo mã id");
            System.out.println("4. Xóa bài hát theo mã id");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    songs[songCount] = new Song();
                    songs[songCount].inputData(singers, singerCount);
                    songCount++;
                    break;
                case 2:
                    System.out.println("Danh sách tất cả bài hát:");
                    for(int i = 0; i < songCount; i++) {
                        songs[i].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã bài hát cần thay đổi thông tin: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < songCount; i++) {
                        if(singers[i].getSingerId() == id) {
                            System.out.println("Nhập thông tin mới cho bài hát có mã " + id);
                            singers[i].inputData();
                            System.out.println("Thay đổi thông tin bài hát thành công.");
                            return;
                        }
                    }
                    System.out.println("Không tìm thấy bài hát có mã " + id);
                    break;
                case 4:
                    System.out.println("Nhập mã bài hát cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < songCount; i++) {
                        if(singers[i].getSingerId() == id) {
                            System.out.println("Xóa bài hát " + songs[i].getSongId() + " thành công.");
                            for(int j = i; j < songCount - 1; j++) {
                                songs[j] = songs[j + 1];
                            }
                            songCount--;
                        }
                    }
                    System.out.println("Không tìm thấy bài hát có mã " + id);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời bạn chọn lại!");
            }
        } while(true);
    }
    public static void searchManagement(Song[] songs, Singer[] singers, int songCount, int singerCount) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************SEARCH-MANAGEMENT************************");
            System.out.println("1. Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2. Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3. Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4. Hiển thị 10 bài hát mới nhất");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    if (songCount <= 0) {
                        System.out.println("Chưa có bài hát nào để tìm kiếm");
                        break;
                    }
                    System.out.println("Nhập vào thông tin muốn tìm kiếm");
                    String searchInput = scanner.nextLine();
                    boolean isExist = false;
                    for (int i = 0; i < songCount; i++) {
                        if (songs[i].getSongName().contains(searchInput)) {
                            System.out.println("Đã tìm thấy bài hát có tên giống với yêu cầu");
                            songs[i].displayData();
                            isExist = true;
                        } else if (songs[i].getSongWriter().contains(searchInput)) {
                            System.out.println("Đã tìm thấy bài hát có mô tả giống với yêu cầu");
                            songs[i].displayData();
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Không tìm thấy bài hát giống yêu cầu");
                    }
                    break;
                case 2:
                    if (singerCount <= 0) {
                        System.out.println("Chưa có ca sĩ nào để tìm kiếm");
                        break;
                    }
                    System.out.println("Nhập vào thông tin muốn tìm kiếm");
                    searchInput = scanner.nextLine();
                    isExist = false;
                    for (int i = 0; i < singerCount; i++) {
                        if (songs[i].getSinger().contains(searchInput)) {
                            System.out.println("Đã tìm thấy ca sĩ có tên giống với yêu cầu");
                            singers[i].displayData();
                            isExist = true;
                        } else if (singers[i].getSingerName().contains(searchInput)) {
                            System.out.println("Đã tìm thấy ca sĩ có mô tả giống với yêu cầu");
                            singers[i].displayData();
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Không tìm thấy ca sĩ giống yêu cầu");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời bạn chọn lại!");
            }
        } while(true);
    }
}