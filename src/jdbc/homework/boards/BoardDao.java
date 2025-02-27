package jdbc.homework.boards;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    Scanner sc = new Scanner(System.in);
    public static int bno=1;
    List<Board> boards = new ArrayList<>(); //Board게시판! boards게시물!(테이블)

    public void list(){
        System.out.println("[게시물 목록]");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-40s\n","no","writer","date","title");
        System.out.println("------------------------------------------");

        readAll();
        mainMenu();
    }

    public void mainMenu(){
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
        System.out.println("---------------------------------");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        System.out.println();

        switch (menuNo){
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    public void create(){
        System.out.println("[새 게시물 입력]");
        Board board = new Board();
        board.setBno(bno);
        bno++;
        System.out.print("제목: ");
        board.setBtitle(sc.nextLine());
        System.out.print("내용: ");
        board.setBcontent(sc.nextLine());
        System.out.print("작성자: ");
        board.setBwriter(sc.nextLine());
        board.setBdate(getCurrentDate());


        System.out.println("-----------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        if(menuNo.equals("1")){
            boards.add(board);
        }
        list();
    }

    public void read(){
        System.out.println("[게시물 읽기]");
        System.out.println("bno: ");
        int bno = Integer.parseInt(sc.nextLine());
        for (Board board : boards) {
            if(board.getBno()==bno){
                System.out.println("##########");
                System.out.println("번호: " + board.getBno());
                System.out.println("제목: " + board.getBtitle());
                System.out.println("내용: " + board.getBcontent());
                System.out.println("작성자: " + board.getBwriter());
                System.out.println("날짜: " + board.getBdate());
                System.out.println("##########");
            }
        }

        System.out.println("---------------------------");
        System.out.println("보조 메뉴: 1. Update | 2.Delete | 3. List");
        System.out.print("메뉴 선택: ");
        String tmp = sc.nextLine();
        switch (tmp){
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> list();
        }
        list();
    }
    public void readAll(){
        for (Board board : boards) {
            System.out.printf("%-10s %-15s %-20s %-40s\n",board.getBno(),board.getBwriter(),board.getBdate(),board.getBtitle());
        }
    }

    public void clear(){
        System.out.println("[게시물 전체 삭제]");
        System.out.println("------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String tmp = sc.nextLine();
        if(tmp.equals("1")){
            boards.removeAll(boards);
        }
        list();
    }

    public void exit(){
        System.out.println("** 게시판 종료 **");
        System.exit(0); //정상 종료 (1)이면 비정상종료

    }

    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;

    }

    public void update(int bno) {
        System.out.println("[수정 내용 입력]");
        for (Board board : boards) {
            if (board.getBno() == bno) {
                System.out.println("제목: ");
                String changeTitle = sc.nextLine();
                System.out.println("내용: ");
                String changeContent = sc.nextLine();
                System.out.println("작성자: ");
                String changeWriter = sc.nextLine();

                System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
                System.out.print("메뉴 선택: ");
                String tmp = sc.nextLine();
                if (tmp.equals("1")) {
                    board.setBtitle(changeTitle);
                    board.setBcontent(changeContent);
                    board.setBwriter(changeWriter);
                }
            }
        }
    }

    public void delete(int bno){
        for (Board board : boards) {
            if(board.getBno() == bno){
                boards.remove(board);
            }
        }
    }
}

