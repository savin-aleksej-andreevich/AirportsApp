package ru.bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportsPartitioner extends Partitioner<AirportsWritableComparable, Text> {

    @Override
    public int getPartition(AirportsWritableComparable key, Text text, int numReduceTasks) {
        return key.getAirportId() % numReduceTasks;
    }
}
