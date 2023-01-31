public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
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


