package tdd.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "testes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingModel {
    private String id;
    private String checkIn;
    private String  checkOut;

    private String numberGuests;

    private String endDate;

    private String status;
}
