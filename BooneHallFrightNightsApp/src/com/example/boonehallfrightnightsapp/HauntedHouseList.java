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

public class HauntedHouseList extends ListActivity
{
	

	//Array of choices for user
	static final String[] CHOICES = new String[]
	{
		"Welcome Host", //I was wondering why the first position is welcome hoe.....
		"Line Divider",
		"Drop Window 1",
		"Gargoyle",
		"Arch Hall Statue",
		"Iron Smith",
		"Hooping Creature",
		"Kitchen Hag",
		"Beast Operator",
		"Torture Cell Victim",
		"Stretch door",
		"Executioner Room",
		"Drop Window 2",
		"Overhead Creature",
		"Impailer Keeper",
		"Demon Druid 1",
		"Demon Druid 2",
		"Chainsaw 1",
		"Chainsaw 2"
	};

	//position number
	public static int CM_position_num;
		
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
	    Toast.makeText(this, "you can't handle this fear", Toast.LENGTH_SHORT).show();
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
					switch(arg2)
					{
						case 0:	CM_position_num = 1;
						launchHauntedHousePartsPage();
								break;
						case 1: CM_position_num = 2;
						launchHauntedHousePartsPage();
								break;
						case 2: CM_position_num = 3;
						launchHauntedHousePartsPage();
								break;
						case 3: CM_position_num = 4;
						launchHauntedHousePartsPage();
								break;
						case 4: CM_position_num = 5;
						launchHauntedHousePartsPage();
								break;
						case 5: CM_position_num = 6;
						launchHauntedHousePartsPage();
								break;
						case 6: CM_position_num = 7;
						launchHauntedHousePartsPage();
								break;
						case 7: CM_position_num = 8;
						launchHauntedHousePartsPage();
								break;
						case 8: CM_position_num = 9;
						launchHauntedHousePartsPage();
								break;
						case 9:	CM_position_num = 10;
						launchHauntedHousePartsPage();
								break;
						case 10: CM_position_num = 11;
						launchHauntedHousePartsPage();
								break;
						case 11: CM_position_num = 12;
						launchHauntedHousePartsPage();
								break;
						case 12: CM_position_num = 13;
						launchHauntedHousePartsPage();
								break;
						case 13: CM_position_num = 14;
						launchHauntedHousePartsPage();
								break;
						case 14: CM_position_num = 15;
						launchHauntedHousePartsPage();
								break;
						case 15: CM_position_num = 16;
						launchHauntedHousePartsPage();
								break;
						case 16: CM_position_num = 17;
						launchHauntedHousePartsPage();
								break;
						case 17: CM_position_num = 18;
						launchHauntedHousePartsPage();
								break;
						default: break;
					}
				}
			}//END OnItemClickListener
		);//END setOnItemClickListener
	}//END setListClickListener
	
	protected void launchHauntedHousePartsPage()
    {
    	//Set up Intent
    	Intent HauntedHousePage = new Intent(this, HauntedHouseParts.class);
    	startActivity(HauntedHousePage);
    	
    }//END launchDirectionsPage

}
