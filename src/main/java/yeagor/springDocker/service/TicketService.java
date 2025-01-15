package yeagor.springDocker.service;

import yeagor.springDocker.model.Ticket;
import yeagor.springDocker.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket getTicket(Integer id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public List<Ticket> convertTicketToList(Ticket ticket){
        return (ticket != null) ? List.of(ticket) : new ArrayList<>();
    }

    public List<Ticket> getAllTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    public void deleteTicket(Integer id) {
        ticketRepository.deleteById(id);
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
