public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = (brand == null || brand == "" ? "default" : brand);
        this.model = (model == null || model == "" ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color == "" ? "белый" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country == "" ? "default" : country);
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


