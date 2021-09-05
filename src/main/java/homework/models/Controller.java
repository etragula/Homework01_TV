package homework.models;

import java.util.Random;

public class Controller {

    private TV tv;
    private Random random;

    public Controller(TV tv) {
        this.tv = tv;
        this.random = new Random();
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void on(int i) {
        Channel[] channels = this.tv.getChannels();
        Channel channel = channels[i];
        if (channel != null) {
            Program[] programs = channel.getPrograms();
            Program program = getValidProgram(programs);

            System.out.printf("Вы смотрите - %10s на %d-м.", program.getName(), i);
        } else {
            System.err.println("Данный канал недоступен, выберите другой");
        }
    }

    private Program getValidProgram(Program[] programs) {
        Program program = null;
        while (program == null)
            program = programs[random.nextInt(10)];
        return program;
    }


}
