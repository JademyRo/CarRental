package ro.jademy.carrental.cars.DaciaTypes.DaciaLoganTypes;

import ro.jademy.carrental.cars.components.*;
import ro.jademy.carrental.cars.components.body_kit_parts.*;
import ro.jademy.carrental.cars.components.EngineParts.*;
import ro.jademy.carrental.cars.components.GearBoxParts.*;
import ro.jademy.carrental.cars.DaciaTypes.DaciaLogan;

import java.math.BigDecimal;

public class LoganStandard extends DaciaLogan {

    public LoganStandard(String chassisNo, Colors color, GBTypes gbType , Integer year, BigDecimal basePrice) {
        super();
        setBodyKit(new BodyKit(chassisNo, color, BodyKitTypes.SEDAN, Doors.FOUR));
        setEngine(new Engine("1.2MPI", "75HP", Fuels.GASOLINE));
        setGearBox(new GearBox(gbType));
        setYear(year);
        setBasePrice(basePrice);
    }
}
