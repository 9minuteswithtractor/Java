package service;

public class Calculation {

    // no attributes


    // constructor
    public Calculation() {

    }

    // methods
    public int convertStringToInt(String numAsString) {

        return Integer.parseInt(numAsString);
    }

    public int calculateCube(int numBeforeCube) {

        return (int) Math.pow(numBeforeCube, 3);
    }

}
