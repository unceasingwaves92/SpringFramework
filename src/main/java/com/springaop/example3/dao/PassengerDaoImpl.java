package com.springaop.example3.dao;

import com.springaop.example3.model.Passenger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("passengerDaoImpl")
public class PassengerDaoImpl implements PassengerDao {

    private static Map<Integer, Passenger> passengerMap = new HashMap<>();
    private static Map<String, Passenger> passengerMap1 = new HashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        if (null != passengerMap.get(id)) {
            return passengerMap.get(id);
        }

        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }

    @Override
    public Passenger getPassengerName(String name) {
        if (null != passengerMap1.get(name)) {
            return passengerMap1.get(name);
        }

        Passenger passenger = new Passenger(name);
        passengerMap1.put(name, passenger);
        return passenger;
    }


}