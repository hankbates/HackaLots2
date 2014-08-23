//Programmer: hank bates
//file: nightmare List
// purpose: to activate the list for Amy's nightmare

package com.example.boonehallfrightnightsapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class NightmareList extends ListActivity
{
	//Array of choices for user
	static final String[] CHOICES = new String[]
	{
		"Welcome Amy",
		"Clown #1",
		"Drop Window Clown",
		"Toy Box Clown #1",
		"Toy Box Clown #2",
		"Drop Box Clown",
		"Bedroom Amy",
		"Bathroom Clown"
	};

	//position number
	public static int AN_position_num;	
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.test);
	    
	    //Set up ArrayAdaptor for the options
	    setListAdapter(new ArrayAdapter<String>
	    	(this, android.R.layout.simple_list_item_1, CHOICES));
	    getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	    getListView().setTextFilterEnabled(true);
		
	    //part of example  
	    //Set up the listener for user clicks on the list
	    setListClickListener();
	    
	    //Set Back button listener
	    setDoneButtonListener();
	    
	    //this toast is for when it opens
	    Toast.makeText(this, "These are your nightmares that come alive", Toast.LENGTH_LONG).show();
	}

	private void setDoneButtonListener()
	{
		Button doneButton = (Button) findViewById(R.id.back_button);
		doneButton.setOnClickListener
		(
			new View.OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					close();
				}
	
				private void close() 
				{
					finish();
				}
			}
		);//END setOnClickListener
	}//END setDoneButtonListener

	private void setListClickListener()
	{
		//Set up the click listener for the options
		getListView().setOnItemClickListener
		(
			new OnItemClickListener()
			{
				//@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
				{
					switch(arg2) //only 8 positions this time
					{
						case 0:	
						AN_position_num = 1;
						launchNightmarePartsPage();
								break;
						case 1: 
						AN_position_num = 2;
						launchNightmarePartsPage();
								break;
						case 2: 
						AN_position_num = 3;
						launchNightmarePartsPage();
								break;
						case 3: 
						AN_position_num = 4;
						launchNightmarePartsPage();
								break;
						case 4: 
						AN_position_num = 5;
						launchNightmarePartsPage();
								break;
						case 5: 
						AN_position_num = 6;
						launchNightmarePartsPage();
								break;
						case 6: 
						AN_position_num = 7;
						launchNightmarePartsPage();
								break;
						case 7: 
						AN_position_num = 8;
						launchNightmarePartsPage();
								break;
						default: break;
					}
				}
			}//END OnItemClickListener
		);//END setOnItemClickListener
	}//END setListClickListener
	
	protected void launchNightmarePartsPage()
    {
    	//Set up Intent
    	Intent NightmarePartsPage = new Intent(this, NightmareParts.class);
    	startActivity(NightmarePartsPage);
    	
    }//END launchDirectionsPage
}
