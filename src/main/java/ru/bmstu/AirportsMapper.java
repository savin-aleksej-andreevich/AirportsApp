package ru.bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class AirportsMapper extends Mapper<LongWritable, Text, AirportsWritableComparable, Text> {
    private static int AIRPORD_INDICATOR = 0, INDEX_ID = 0, INDEX_NAME = 1;
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AirportsWritableComparable, Text>.Context context) throws IOException, InterruptedException {
        super.map(key, value, context);
    }
}
