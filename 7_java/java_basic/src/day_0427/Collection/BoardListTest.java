package day_0427.Collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListTest {
    public static void main(String[] args) {
        List<Board> list1 = new ArrayList<Board>();

        list1.add(new Board("제목1", "내용1", "shj"));
        list1.add(new Board("제목2", "내용2", "shj"));
        list1.add(new Board("제목3", "내용3", "shj"));

        System.out.println("현재 게시판의 글의 수 : "+list1.size()+"개");

        for (Board board : list1){
            System.out.println("글 제목 : "+board.getSubject());
            System.out.println("글 내용 : "+board.getContent());
            System.out.println("글쓴이 : "+board.getWriter());
            System.out.println();
        }
        list1.remove(2);
        printBoard(list1);
//        for (Board board : list1){
//            System.out.println("글 제목 : "+board.getSubject());
//            System.out.println("글 내용 : "+board.getContent());
//            System.out.println("글쓴이 : "+board.getWriter());
//            System.out.println();
//        }

    }
    public static void printBoard(List<Board> list){

        for (Board board :list){
            System.out.println("글 제목 : "+board.getSubject());
            System.out.println("글 내용 : "+board.getContent());
            System.out.println("글쓴이 : "+board.getWriter());
            System.out.println();
        }
    }
}
