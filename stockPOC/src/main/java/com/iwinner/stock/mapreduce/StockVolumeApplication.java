package com.iwinner.stock.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class StockVolumeApplication {

	
	public static class StockMapper extends Mapper<LongWritable, Text, Text, Text>{
		
		protected void map(LongWritable key, Text value,
				Mapper<LongWritable, Text, Text, Text>.Context context)
				throws IOException, InterruptedException {
			super.map(key, value, context);
		}
	}
	
	public static class StockReducer extends Reducer<Text, Text, Text, Text>{
		
		@Override
		protected void reduce(Text arg0, Iterable<Text> arg1,
				Reducer<Text, Text, Text, Text>.Context arg2)
				throws IOException, InterruptedException {
			super.reduce(arg0, arg1, arg2);
		}
		
	}
}
