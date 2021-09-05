package homework.models;

public class TV {

    private String model;

    private Channel[] channels;
    private int channelsAmount;

    public TV(String model) {
        this.model = model;
        this.channels = new Channel[11];
        this.channelsAmount = 1;
    }

    public void addChannel(Channel channel) {
        if (channelsAmount == channels.length) {
            System.err.println("Список каналов для данной модели переполнен.");
            return;
        }
        channels[channelsAmount] = channel;
        channelsAmount++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Channel[] getChannels() {
        return channels;
    }
}
