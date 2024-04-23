package com.cabbooking.strategies;

import com.cabbooking.model.Rider;
import com.cabbooking.model.Cab;
import com.cabbooking.model.Location;

import java.util.List;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
