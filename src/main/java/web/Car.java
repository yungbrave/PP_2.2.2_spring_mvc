package web;


public class Car {

    String model;

    String series;

    double engineVolume;

    public Car() {
    }

    public Car(String model, String engine, double engineVolume) {
        this.model = model;
        this.series = engine;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + series + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
