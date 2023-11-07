class Tv{
    String color;
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

}

public class TvTest {
    public static void main(String[] args) {
        Tv2 t; //TV 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv2(); //Tv 인스턴스를 생성한다.
        t.channel = 7; //Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();
        System.out.println("t.channel = " + t.channel);
    }
}
