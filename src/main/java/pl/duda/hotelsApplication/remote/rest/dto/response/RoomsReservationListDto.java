package pl.duda.hotelsApplication.remote.rest.dto.response;

import pl.duda.hotelsApplication.remote.rest.dto.request.RoomReservationDto;

import java.util.List;

public class RoomsReservationListDto {
    private int id;
    private OrderStatusType status;
    private List<RoomReservationDto> roomsReservation;

    public RoomsReservationListDto(int id, OrderStatusType status, List<RoomReservationDto> roomsReservation) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }
}
