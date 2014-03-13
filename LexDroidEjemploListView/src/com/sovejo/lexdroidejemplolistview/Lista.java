package com.sovejo.lexdroidejemplolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.TextView;

public class Lista extends ArrayAdapter<String> 
{
	private final Context context;
	private final String[] animales;
	
	public Lista(Context context, String[] animales) 
	{
		super(context, R.layout.elemento, animales);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.animales = animales;
	}

	public View getView(int position, View converView, ViewGroup parent)
	{
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.elemento, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.textView01);
		//ImageView imageView = (ImageView) rowView.findViewById(R.id.logo01);
		
		textView.setText(animales[position]);
		//imageView.setImageResource(R.drawable.ic_launcher);
		
		//textView.set
		
		return rowView;
	}
	
}
