public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;




    @Override
    public String toString() {
        return "Auto" +
                "\n марка: " + brand +
                "\n модель: " + model +
                "\n engineVolume: " + engineVolume +
                "\n color: " + color +
                "\n year: " + year +
                "\n country: " + country;
    }
}


