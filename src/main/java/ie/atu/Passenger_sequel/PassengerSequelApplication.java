package ie.atu.Passenger_sequel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerSequelApplication {


	PassengerService myservice;

	@Autowired
	public PassengerSequelApplication(PassengerService myservice) {
		this.myservice = myservice;
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerSequelApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers()
	{
		return myservice.getPassengers();
	}


	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		return myservice.getPassenger(25);
	}


}
