package ie.atu.Passenger_sequel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PassengerRepo extends JpaRepository<Passenger,Long> {
    public Passenger findPassengerByName(String name);

}
