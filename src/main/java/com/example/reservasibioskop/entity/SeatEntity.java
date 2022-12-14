package com.example.reservasibioskop.entity;

//import org.hibernate.Hibernate;
//import java.util.Objects;

import lombok.*;
import javax.persistence.*;
//import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "Seats")
public class SeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_row")
    private Character seatRow;

    @Column(name = "seat_number")
    private Integer seatNumber;

    @Column(name = "full_status")
    private Boolean fullStatus;

//    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private LocalDateTime updatedAt;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        SeatEntity that = (SeatEntity) o;
//        return id != null && Objects.equals(id, that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }
}
