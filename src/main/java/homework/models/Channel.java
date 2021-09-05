package homework.models;

public class Channel {

    private String name;

    private Program[] programs;
    private int programsAmount;

    public Channel(String name) {
        this.name = name;
        this.programs = new Program[11];
        this.programsAmount = 1;
    }

    public void addProgram(Program program) {
        if (programsAmount == programs.length) {
            System.err.println("Список программ для данного канала переполнен.");
            return;
        }
        programs[programsAmount] = program;
        programsAmount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Program[] getPrograms() {
        return programs;
    }
}
