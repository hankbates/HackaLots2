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

public class ZombieTownList extends ListActivity
{

	//Array of choices for user
		static final String[] CHOICES = new String[]
		{
			"Street Zombie #1", //I was wondering why the first position is welcome hoe.....
			"Street Zombie #2",
			"Street Zombie #3",
			"Street Zombie #4",
			"Street Zombie #5",
			"Door Bust Zombie #1",
			"Door Bust Zombie #2",
			"Doctor",
			"Doc room Zombie",
			"Clinic Bed Zombie ",
			"Nurse with baby",
			"Cage Zombie #1",
			"Cage Zombie #2",
			"Bus Zombie #1",
			"Bus Zombie #2",
			"Clinic Window Zombie",
			"Street Zombie #6",
			"Garage Zombie",
			"Junk Yard Zombie #1",
			"Junk Yard Zombie #2"
		};


		//position number
		public static int ZT_position_num;
		
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
	    Toast.makeText(this, "They feast on your fear", Toast.LENGTH_LONG).show();
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
						case 0:	ZT_position_num = 1;
						launchZombieTownPartsPage();
								break;
						case 1: ZT_position_num = 2;
						launchZombieTownPartsPage();
								break;
						case 2: ZT_position_num = 3;
						launchZombieTownPartsPage();
								break;
						case 3: ZT_position_num = 4;
						launchZombieTownPartsPage();
								break;
						case 4: ZT_position_num = 5;
						launchZombieTownPartsPage();
								break;
						case 5: ZT_position_num = 6;
						launchZombieTownPartsPage();
								break;
						case 6: ZT_position_num = 7;
						launchZombieTownPartsPage();
								break;
						case 7: ZT_position_num = 8;
						launchZombieTownPartsPage();
								break;
						case 8: ZT_position_num = 9;
						launchZombieTownPartsPage();
								break;
						case 9:	ZT_position_num = 10;
						launchZombieTownPartsPage();
								break;
						case 10: ZT_position_num = 11;
						launchZombieTownPartsPage();
								break;
						case 11: ZT_position_num = 12;
						launchZombieTownPartsPage();
								break;
						case 12: ZT_position_num = 13;
						launchZombieTownPartsPage();
								break;
						case 13: ZT_position_num = 14;
						launchZombieTownPartsPage();
								break;
						case 14: ZT_position_num = 15;
						launchZombieTownPartsPage();
								break;
						case 15: ZT_position_num = 16;
						launchZombieTownPartsPage();
								break;
						case 16: ZT_position_num = 17;
						launchZombieTownPartsPage();
								break;
						case 17: ZT_position_num = 18;
						launchZombieTownPartsPage();
								break;
						case 18: ZT_position_num = 19;
						launchZombieTownPartsPage();
								break;
						case 19: ZT_position_num = 20;
						launchZombieTownPartsPage();
								break;
						default: break;
					}
				}
			}//END OnItemClickListener
		);//END setOnItemClickListener
	}//END setListClickListener
	
		
		protected void launchZombieTownPartsPage()
	    {
	    	//Set up Intent
	    	Intent ZombieTownPage = new Intent(this, ZombieTownParts.class);
	    	startActivity(ZombieTownPage);
	    	
	    }//END launchDirectionsPage
}
