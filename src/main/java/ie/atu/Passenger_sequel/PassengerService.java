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

    public Passenger findPassengerById(Long passengerID){;
        return passengerRepo.findPassengerById(passengerID);
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

    public List findPassengersByAgeRange(int age, int age2)
    {
        return passengerRepo.findPassengerByAge(age, age2);
    }
}
