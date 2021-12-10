package ru.bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportsWritableComparable, Text> {
    public static int FLIGHT_INDICATOR = 1;
    public static String SEPARATOR = ",";

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        
    }
}
