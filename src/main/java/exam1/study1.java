package exam1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class study1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("명령어 :");
            String commend = scan.nextLine();
            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (commend.equals("add")) {
                String title = scan.nextLine();
                System.out.print("게시물 제목을 입력해주세요 :");
                String content = scan.nextLine();
                System.out.println("게시물 내용을 입력해주세요 :");

                System.out.println("게시물이 등록되었습니다");
            } else if (commend.equals("list")) {
                System.out.println("================");
                for(int i = 0; i < titles.size(); i++){
                    String title = scan.nextLine();
                    System.out.println("내용 : ");
                    String content = scan.nextLine();
                }
            }


        }
    }
}

