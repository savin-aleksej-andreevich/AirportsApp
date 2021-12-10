package ru.bmstu;

import org.apache.hadoop.io.WritableComparator;

public class AirportsComparator extends WritableComparator {
    protected AirportsComparator () {
        super(AirportsWritableComparable.class, true);
    }
}
