package com.crud.backend.model.tickets;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.sql.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="tickets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "tickettype")
    TicketType ticketType;
    @Column(name = "creationdate")
    Date creationDate = new Date(System.currentTimeMillis());
    String description;
}

