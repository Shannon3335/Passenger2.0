package ie.atu.Passenger_sequel;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers()
    {
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID){
        Passenger p = new Passenger("Mr", "Robb",2472872342L, 3534324L, 25);
        return p;
    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);

    }

    public Passenger findPassengerbyName(String name)
    {
        return passengerRepo.findPassengerByName(name);
    }

    public void deletePassenger(Long count)
    {
        passengerRepo.deleteById(count);
    }
}
