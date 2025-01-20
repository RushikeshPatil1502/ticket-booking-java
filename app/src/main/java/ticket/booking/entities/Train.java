package ticket.booking.entities;

import java.util.Date;
import java.util.List;

public class Train {
    private String trainId;
    private String trainNumber;
    private Date departTime;
    private Date arrivalTime;
    private List<List<Integer>> seats;
}
