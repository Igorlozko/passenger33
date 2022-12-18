package ie.atu.passenger33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class Passenger33Application {

	PassengerService myService;

	public Passenger33Application(PassengerService myService) {
		this.myService = myService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Passenger33Application.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
		return myService.getPassengers();
	}
	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){

		return myService.getPassenger(passengerID);
	}
}

