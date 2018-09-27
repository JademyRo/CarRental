package ro.jademy.carrental.Cars.DaciaTypes.DaciaLoganTypes;

import ro.jademy.carrental.Cars.Components.*;
import ro.jademy.carrental.Cars.Components.BodyKitParts.*;
import ro.jademy.carrental.Cars.Components.EngineParts.*;
import ro.jademy.carrental.Cars.Components.GearBoxParts.*;
import ro.jademy.carrental.Cars.DaciaTypes.DaciaLogan;

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
