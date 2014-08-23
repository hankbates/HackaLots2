package com.example.boonehallfrightnightsapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NightmareParts extends Activity
{
	public int current_AN_Number = NightmareList.AN_position_num;
	private TextView edit_title;
	private TextView edit_info;
	//private TextView edit_makeup;
	//private TextView edit_safety;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part_layout);
        
        editTextforAll();
        setDoneButtonListener();
        setSafetyButtonListener();
    }//END onCreate
	
			//Set up the Done button to initialize intent and finish
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
							finish();
						}
					}
				);//END setOnClickListener
			}//END setDoneButtonListener
			
			private void setSafetyButtonListener()
			{
				Button safetyButton = (Button) findViewById(R.id.safety_button);
				safetyButton.setOnClickListener
				(
					new View.OnClickListener()
					{
						@Override
						public void onClick(View v)
						{
							//doesn't work
							launchNightmareSafetyPage();
						}
					}
				);//END setOnClickListener
			}//END setDoneButtonListener
			
			private void editTextforAll()
			{
				if (current_AN_Number == 1)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_1);
					
					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_1);

					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_1); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_1); 
				}
				else if (current_AN_Number == 2)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_2);

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_2); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_2); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_2); 
				}
				else if (current_AN_Number == 3)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_3);  

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_3); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_3); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_3); 
				}
				else if (current_AN_Number == 4)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_4);

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_4); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_4); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_4); 
				}
				else if (current_AN_Number == 5)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_5); 

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_5); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_5); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_5); 
				}
				else if (current_AN_Number == 6)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_6); 

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_6); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_6); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_6); 
				}
				else if (current_AN_Number == 7)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_7); 

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_7); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_7); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_7); 
				}
				else if (current_AN_Number == 8)
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.AN_title_8); 

					edit_info = (TextView)findViewById(R.id.part_info);           
					edit_info.setText(R.string.AN_info_8); 
					
					//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
					//edit_makeup.setText(R.string.AN_makeup_8); 
					
					//edit_safety = (TextView)findViewById(R.id.part_safety);           
					//edit_safety.setText(R.string.AN_safety_8); 
				}
				else
				{
					edit_title = (TextView)findViewById(R.id.part_title);           
					edit_title.setText(R.string.error_text);
				}
			}
			protected void launchNightmareSafetyPage()
		    {
		    	//Set up Intent
		    	Intent NightmareSafetyPage = new Intent(this, NightmareSafety.class);
		    	startActivity(NightmareSafetyPage);
		    	
		    }//END launchDirectionsPage
}
