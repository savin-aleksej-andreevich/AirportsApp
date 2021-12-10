package ru.bmstu;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class AirportsWritableComparable implements WritableComparable {
    private int airportId, indicator;

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public int getIndicator() {
        return indicator;
    }

    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }

    public AirportsWritableComparable () {}

    public AirportsWritableComparable(int airportId, int indicator) {
        this.airportId = airportId;
        this.indicator = indicator;
    }

    @Override
    public int compareTo(Object o) {
        AirportsWritableComparable otherAirport = (AirportsWritableComparable) o;
        if (this.airportId > otherAirport.airportId) return 1;
        if (this.airportId < otherAirport.airportId) return -1;
        return Integer.compare(this.indicator, otherAirport.indicator);
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(airportId);
        dataOutput.writeInt(indicator);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.airportId = dataInput.readInt();
        this.indicator = dataInput.readInt();
    }

    @Override
    public String toString() {
        return "AirportsWritableComparable{" +
                "airportId=" + airportId +
                ", indicator=" + indicator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirportsWritableComparable that = (AirportsWritableComparable) o;
        return airportId == that.airportId && indicator == that.indicator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportId, indicator);
    }
}
