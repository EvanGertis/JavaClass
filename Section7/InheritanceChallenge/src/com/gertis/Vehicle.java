package com.gertis;

public class Vehicle {

    public boolean ChangingGears;
    public boolean IncreaingSpeed;
    public boolean DecreasingSpeed;
    public boolean TurningLeft;
    public boolean TurningRight;

    public Vehicle(boolean changingGears, boolean increaingSpeed, boolean decreasingSpeed, boolean turningLeft, boolean turningRight) {
        ChangingGears = changingGears;
        IncreaingSpeed = increaingSpeed;
        DecreasingSpeed = decreasingSpeed;
        TurningLeft = turningLeft;
        TurningRight = turningRight;
    }

    public boolean isChangingGears() {
        return ChangingGears;
    }

    public void setChangingGears(boolean changingGears) {
        ChangingGears = changingGears;
    }

    public boolean isIncreaingSpeed() {
        return IncreaingSpeed;
    }

    public void setIncreaingSpeed(boolean increaingSpeed) {
        IncreaingSpeed = increaingSpeed;
    }

    public boolean isDecreasingSpeed() {
        return DecreasingSpeed;
    }

    public void setDecreasingSpeed(boolean decreasingSpeed) {
        DecreasingSpeed = decreasingSpeed;
    }

    public boolean isTurningLeft() {
        return TurningLeft;
    }

    public void setTurningLeft(boolean turningLeft) {
        TurningLeft = turningLeft;
    }

    public boolean isTurningRight() {
        return TurningRight;
    }

    public void setTurningRight(boolean turningRight) {
        TurningRight = turningRight;
    }
}
