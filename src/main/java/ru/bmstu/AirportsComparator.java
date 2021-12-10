package ru.bmstu;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportsComparator extends WritableComparator {

    protected AirportsComparator () {
        super(AirportsWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable w1, WritableComparable w2) {
        AirportsWritableComparable airport1 = (AirportsWritableComparable)w1;
        AirportsWritableComparable airport2 = (AirportsWritableComparable)w2;
        return Integer.compare(airport1.getAirportId(), airport2.getAirportId());
    }
}
