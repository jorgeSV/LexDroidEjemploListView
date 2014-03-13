package com.sovejo.lexdroidejemplolistview;

import android.os.Bundle;
import android.app.ListActivity;

public class MainActivity extends ListActivity 
{ 
	static final String[] animales01 = {"Perro", "Gato", "Caballo", "Conejo", "León", "Tigre", "Serpiente", "Cocodrilo", "Hipopótamo", "Ratón"};
	
	//Public en lugar de static para poder usar el contexto (this)
	/*static final String[] animales01 = 
		{
			this.getResources().getString(R.string.perro),
			this.getResources().getString(R.string.gato),
			this.getResources().getString(R.string.caballo),
			this.getResources().getString(R.string.conejo),
			this.getResources().getString(R.string.leon),
			this.getResources().getString(R.string.tigre),
			this.getResources().getString(R.string.cocodrilo),
			this.getResources().getString(R.string.hipopotamo),
			this.getResources().getString(R.string.raton),
		};
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		setListAdapter(new Lista(this, animales01));
	}

}
