package web.model;


public class Car {

   private String color;
  private   String model;
   private int series;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String color, String model, int series) {
        this.color = color;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
