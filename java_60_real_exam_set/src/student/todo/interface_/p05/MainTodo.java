package student.todo.interface_.p05;

interface PlayableTodo {
    // TODO 1: play 선언
    void play();
}

class MusicTodo implements PlayableTodo {
    // TODO 2: play 구현
    @Override
    public void play() {
        System.out.println("노래 시작");
    }
}

class MovieTodo implements PlayableTodo {
    // TODO 3: play 구현
    @Override
    public void play() {
        System.out.println("영화 시작");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 인터페이스 배열로 저장 후 반복
        PlayableTodo[] playableTodos = new PlayableTodo[2];
        playableTodos[0] = new MusicTodo();
        playableTodos[1] = new MovieTodo();
        for (PlayableTodo p : playableTodos){
            p.play();
        }
    }
}
