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

public class HauntedHayrideList extends ListActivity
{

	//Array of choices for user
	static final String[] CHOICES = new String[]
	{
		"Ma at Ma's Diener", 
		"Pa at Ma's Diener",
		"Daughter w/ Chainsaw",
		"T-Rex operator",
		"Gilly #1",
		"Gilly #2",
		"Electric Shed Worker",
		"Scissor Serpent Ghoul #1",
		"Scissor Serpent Ghoul #2",
		"Dragon Ghoul #1",
		"Dragon Ghoul #2",
		"Gravedigger",
		"Graveyard Drop Window #1",
		"Graveyard Drop Window #2",
		"Specter Operator",
		"Graveyard Zombie #1",
		"Graveyard Zombie #2",
		"Mausoleum #1",
		"Mausoleum #2",
		"Mausoleum #3",
		"Mausoleum #4",
		"Voodoo Master",
		"Torso Boy",
		"Slaughterhouse #1",
		"Slaughterhouse #2",
		"Hillbilly #1",
		"Hillbilly #2",
		"Grandpa Shack",
		"Grinder Barn",
		"Corn Creature #1",
		"Corn Creature #2"
	};
	
	
	//position number
	public static int HH_position_num;
	
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
	    Toast.makeText(this, "I smell your fear.", Toast.LENGTH_SHORT).show();
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
						case 0:	HH_position_num = 1;
						launchHauntedHayridePartsPage();
								break;
						case 1: HH_position_num = 2;
						launchHauntedHayridePartsPage();
								break;
						case 2: HH_position_num = 3;
						launchHauntedHayridePartsPage();
								break;
						case 3: HH_position_num = 4;
						launchHauntedHayridePartsPage();
								break;
						case 4: HH_position_num = 5;
						launchHauntedHayridePartsPage();
								break;
						case 5: HH_position_num = 6;
						launchHauntedHayridePartsPage();
								break;
						case 6: HH_position_num = 7;
						launchHauntedHayridePartsPage();
								break;
						case 7: HH_position_num = 8;
						launchHauntedHayridePartsPage();
								break;
						case 8: HH_position_num = 9;
						launchHauntedHayridePartsPage();
								break;
						case 9:	HH_position_num = 10;
						launchHauntedHayridePartsPage();
								break;
						case 10: HH_position_num = 11;
						launchHauntedHayridePartsPage();
								break;
						case 11: HH_position_num = 12;
						launchHauntedHayridePartsPage();
								break;
						case 12: HH_position_num = 13;
						launchHauntedHayridePartsPage();
								break;
						case 13: HH_position_num = 14;
						launchHauntedHayridePartsPage();
								break;
						case 14: HH_position_num = 15;
						launchHauntedHayridePartsPage();
								break;
						case 15: HH_position_num = 16;
						launchHauntedHayridePartsPage();
								break;
						case 16: HH_position_num = 17;
						launchHauntedHayridePartsPage();
								break;
						case 17: HH_position_num = 18;
						launchHauntedHayridePartsPage();
								break;
						case 18: HH_position_num = 19;
						launchHauntedHayridePartsPage();
								break;
						case 19: HH_position_num = 20;
						launchHauntedHayridePartsPage();
								break;
						case 20: HH_position_num = 21;
						launchHauntedHayridePartsPage();
								break;
						case 21: HH_position_num = 22;
						launchHauntedHayridePartsPage();
								break;
						case 22: HH_position_num = 23;
						launchHauntedHayridePartsPage();
								break;
						case 23: HH_position_num = 24;
						launchHauntedHayridePartsPage();
								break;
						case 24: HH_position_num = 25;
						launchHauntedHayridePartsPage();
								break;
						case 25: HH_position_num = 26;
						launchHauntedHayridePartsPage();
								break;
						case 26: HH_position_num = 27;
						launchHauntedHayridePartsPage();
								break;
						case 27: HH_position_num = 28;
						launchHauntedHayridePartsPage();
								break;
						case 28: HH_position_num = 29;
						launchHauntedHayridePartsPage();
								break;
						case 29: HH_position_num = 30;
						launchHauntedHayridePartsPage();
								break;
						
						default: break;
					}
				}
			}//END OnItemClickListener
		);//END setOnItemClickListener
	}//END setListClickListener
	
	protected void launchHauntedHayridePartsPage()
    {
    	//Set up Intent
    	Intent HauntedHayridePage = new Intent(this, HauntedHayrideParts.class);
    	startActivity(HauntedHayridePage);
    	
    }//END launchDirectionsPage

}
