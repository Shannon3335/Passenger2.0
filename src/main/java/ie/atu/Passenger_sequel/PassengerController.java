package ie.atu.Passenger_sequel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

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
    public Passenger getPassenger(@PathVariable Long passengerID){
        return myservice.findPassengerById(passengerID);
    }

    @PostMapping
    public void savePassenger(@RequestBody Passenger passenger)
    {
        myservice.savePassenger(passenger);
    }

    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name")String name)
    {
        return myservice.findPassengerbyName(name);
    }

    @DeleteMapping("delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count)
    {
        myservice.deletePassenger(count);
    }

    @GetMapping("/age")
    public List<Passenger> getPassengersByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2)
    {
        return myservice.findPassengersByAgeRange(age1, age2);
    }
}
