package com.iwinner.stock.mapreduce;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
//https://acadgild.com/blog/writable-and-writablecomparable-in-hadoop/
//public class DowJonesDataWritable implements WritableComparable<DowJonesDataWritable> {
	
	public class DowJonesDataWritable implements Writable	 {

	private Text quater;
	private Text volume;
	
	public void set(Text quater, Text volume) {
		this.quater = quater;
		this.volume = volume;
	}
	
	public DowJonesDataWritable() {
		set(new Text(), new Text());
	}
	
	public DowJonesDataWritable(String quater, String volumen) {
		set(new Text(quater), new Text(volume));
	}
	
	public Text getQuater() {
		return quater;
	}
	
	public Text getVolume() {
		return volume;
	}
		
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		quater.readFields(in);
		volume.readFields(in);
	}

	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		quater.write(out);
		volume.write(out);
	}

	/*public int compareTo(DowJonesDataWritable o) {
		
		
		if (ipaddress.compareTo(o.ipaddress)==0)
	     {
	       return (timestamp.compareTo(o.timestamp));
	     }
	     else return (ipaddress.compareTo(o.ipaddress));
	 
		return 0;
	}*/

}
