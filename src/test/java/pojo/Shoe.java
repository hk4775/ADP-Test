package pojo;

import java.util.Objects;

public class Shoe {
    public String Brand;
            public String Name;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getReleaseMonth() {
        return ReleaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        ReleaseMonth = releaseMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return Objects.equals(Brand, shoe.Brand) &&
                Objects.equals(Name, shoe.Name) &&
                Objects.equals(Price, shoe.Price) &&
                Objects.equals(Description, shoe.Description) &&
                Objects.equals(ReleaseMonth, shoe.ReleaseMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand, Name, Price, Description, ReleaseMonth);
    }

    public String Price;
            public String Description;
            public String ReleaseMonth;
}
