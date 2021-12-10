package ru.bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class AirportsReducer extends Reducer <AirportsWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportsWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        
    }
}
