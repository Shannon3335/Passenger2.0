package ie.atu.Passenger_sequel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Robb",2472872342L, 3534324L, 25),
                new Passenger("Mr", "Ross",2123234343L, 32133423L, 25),
                new Passenger("Mr", "Rick",53453242323L, 35442346L, 25)
        );
        return myPassengers;
    }
}
