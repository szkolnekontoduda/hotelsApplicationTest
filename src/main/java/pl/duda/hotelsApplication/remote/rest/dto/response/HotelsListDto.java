package pl.duda.hotelsApplication.remote.rest.dto.response;

import java.util.List;

public class HotelsListDto {

    private List<HotelDto> hotels;

    public HotelsListDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
