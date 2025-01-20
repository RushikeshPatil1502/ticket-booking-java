package ticket.booking.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Ticket {
    private String ticketsId;
    private String userId;
    private String source;
    private  String destination;
    private Date dateOfTravel;
    private Train train;
    private Map<String, Time> stationTimes;
    private List<String> stations;
}
