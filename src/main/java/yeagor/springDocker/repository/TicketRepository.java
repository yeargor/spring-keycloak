package yeagor.springDocker.repository;

import yeagor.springDocker.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
