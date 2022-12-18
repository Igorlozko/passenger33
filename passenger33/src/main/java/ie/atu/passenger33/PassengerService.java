package ie.atu.passenger33;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    public List<Passenger> getPassengers(){

        List<Passenger> myPassengers =List.of(
                new Passenger("Mr","Paul",123,21,23),
                new Passenger("Mr","Adam",6666,555,44),
                new Passenger("Mr","Dean",123,21,23));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger ("Mr","Paul",123,21,23);
        return myPassenger;
    }

}