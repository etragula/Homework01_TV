package homework;

import homework.models.Channel;
import homework.models.Controller;
import homework.models.Program;
import homework.models.TV;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        Channel channel = new Channel("Первый");
        Program p1 = new Program("Давай поженимся");
        Program p2 = new Program("Малахов+");
        Program p3 = new Program("Пусть говорят");

        Controller controller = new Controller(tv);

        tv.addChannel(channel);
        channel.addProgram(p1);
        channel.addProgram(p2);
        channel.addProgram(p3);

        controller.on(1);
    }
}
