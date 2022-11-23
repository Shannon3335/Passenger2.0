package ie.atu.Passenger_sequel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerSequelApplication {

	@GetMapping(path = "/getPassengers")
	public List<Passenger> getPassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Robb",2472872342L, 3534324L, 25),
				new Passenger("Mr", "Ross",2123234343L, 32133423L, 25),
				new Passenger("Mr", "Rick",53453242323L, 35442346L, 25)
		);
		return myPassengers;
	}

	@GetMapping(path = "/getPassenger")
	public Passenger getPassenger(@PathVariable (value = "passengerID") String passengerID) {
		Passenger p = new Passenger("Mr", "Robb", 2472872342L, 3534324L, 25);
		return p;
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerSequelApplication.class, args);
	}

}
