//Programmer: hank bates
//file: Main Activity
// purpose:  activates it all

package com.example.boonehallfrightnightsapp;


import android.os.Bundle;
import android.view.Menu;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity 
{

	static final String[] CHOICES = new String[]
			{
				"Castle Midevil",
				"Amy's Nightmare",
				"Zombie Town",
				"Haunted Hayride",
				"Quit"
			};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fn_main);
		
		
		 //found this part on an example
		 //Set up ArrayAdaptor for the options
        setListAdapter(new ArrayAdapter<String>
        	(this, android.R.layout.simple_list_item_1, CHOICES));
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setTextFilterEnabled(true);
        
		
      //part of example  
      //Set up the listener for user clicks on the list
        setListClickListener();
        
        //this toast is for when it opens
        Toast.makeText(this, "I see your fear...", Toast.LENGTH_LONG).show();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
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
	    					case 0:	launchHousePage();
	    							break;
	    					case 1: launchNightmarePage();
	    							break;
	    					case 2: launchZombiePage();
	    							break;
	    					case 3: launchHayridePage();
	    							break;
	    					case 4: finish();
	    							break;
	    					default: break;
	    				}
	    			}
	    		}//END OnItemClickListener
	    	);//END setOnItemClickListener
		}//END setListClickListener

	 //goes to haunted house
	 protected void launchHousePage()
	    {
	    	//Set up Intent
	    	Intent launchHouse = new Intent(this, HauntedHouseList.class);
	    	startActivity(launchHouse);
	    	
	    }//END launchHousePage
	  
	 //goes to Amy's Nightmare
	 protected void launchNightmarePage()
	 	{
	    	//Set up Intent
	    	Intent launchnightmare = new Intent(this, NightmareList.class);
	    	startActivity(launchnightmare);
	    	
	 	}//END launchNightmarePage
	 
	 //goes to Amy's Nightmare
	 protected void launchZombiePage()
	 	{
		 	//Set up Intent
		 	Intent launchzombies = new Intent(this, ZombieTownList.class);
		 	startActivity(launchzombies);
		    	
	 	}//END launchZombiePage 
		 
	 //goes to haunted house
	 protected void launchHayridePage()
	    {
	    	//Set up Intent
	    	Intent launchhayride = new Intent(this, HauntedHayrideList.class);
	    	startActivity(launchhayride);
	    	
	    }//END launchHayridePage
}
