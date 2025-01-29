package com.crud.backend.repository.tickets;

import com.crud.backend.model.tickets.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
