package ru.bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportsWritableComparable, Text> {
    private static int FLIGHT_INDICATOR = 1;
    private static int INDEX_AIRPORT = 14;
    private static int INDEX_DELAY = 18;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] params = value.toString().split(",");
        if (key.get() > 0) {
            String delayString = params[INDEX_DELAY];
            float delay = delayString.isEmpty()? 0.0f : Float.parseFloat(delayString);
            if (delay > 0.0) {
                int airportId = Integer.parseInt(params[INDEX_AIRPORT]);
                context.write(new AirportsWritableComparable(airportId, FLIGHT_INDICATOR), new Text(delayString));
            }
        }
    }
}
