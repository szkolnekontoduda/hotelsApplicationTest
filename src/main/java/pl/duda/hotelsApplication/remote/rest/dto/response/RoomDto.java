package pl.duda.hotelsApplication.remote.rest.dto.response;

public class RoomDto {

    private int id;
    private int beds;
    private float price;

    public RoomDto(int id, int beds, float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
