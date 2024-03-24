package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    private static final int LOWEST_CHANNEL = 3;

    private static final int HIGHEST_CHANNEL = 18;
    private static final int MINIMUM_VOLUME = 0;

    private static final int MAXIMUM_VOLUME = 10;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;
    }
    public void turnOn() {
        isOn = true;
    }
    public void changeChannel(int newChannel) {
        if (isOn && newChannel >= LOWEST_CHANNEL && newChannel <= HIGHEST_CHANNEL) {
            currentChannel = newChannel;
        }
    }
    public void channelUp() {
        if (isOn) {
            if (currentChannel < HIGHEST_CHANNEL) {
                currentChannel++;
            } else {
                currentChannel = LOWEST_CHANNEL;
            }
        }
    }

    public void channelDown() {
        if (isOn) {
            if (currentChannel > LOWEST_CHANNEL) {
                currentChannel--;
            } else {
                currentChannel = HIGHEST_CHANNEL;
            }
        }
    }

    public void raiseVolume() {
        if (isOn && currentVolume < MAXIMUM_VOLUME) {
            currentVolume++;
        }
    }
    public void lowerVolume() {
        if (isOn && currentVolume > MINIMUM_VOLUME) {
            currentVolume--;
        }
    }

}
