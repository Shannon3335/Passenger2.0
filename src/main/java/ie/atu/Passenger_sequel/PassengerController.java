package ie.atu.Passenger_sequel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "api/passenger")

public class PassengerController {
    PassengerService myservice;
    @Autowired
    public PassengerController(PassengerService myservice) {
        this.myservice = myservice;
    }

    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myservice.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID){
        return myservice.getPassenger(passengerID);
    }

}
