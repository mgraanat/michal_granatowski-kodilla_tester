package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> testList = new ArrayList<>();
        testList.add(new Flight("Warsaw", "NYC"));
        testList.add(new Flight("Warsaw", "Miami"));
        assertEquals(result, testList);
    }

    @Test
    public void testFindFlightTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Miami");
        //then
        List<Flight> testList = new ArrayList<>();
        testList.add(new Flight("Warsaw", "Miami"));
        assertEquals(result, testList);
    }
}