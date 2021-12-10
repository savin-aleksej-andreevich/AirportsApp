package ru.bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportsReducer extends Reducer <AirportsWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportsWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        int count = 0;
        float min = -1.0f, max = 0.0f, sum = 0.0f;
        Iterator<Text> valuesIterator = values.iterator();
        String airport = valuesIterator.next().toString();
    }
}
