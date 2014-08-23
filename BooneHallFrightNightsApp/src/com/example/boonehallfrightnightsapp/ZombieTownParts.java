package com.example.boonehallfrightnightsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ZombieTownParts extends Activity
{
	public int current_ZT_Number = ZombieTownList.ZT_position_num;
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
    }
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
					finish();
				}
			}
		);//END setOnClickListener
	}//END setDoneButtonListener
	
	private void editTextforAll()
	{
		if (current_ZT_Number == 1)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_1);
			
			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_1);

			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_1); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_1); 
		}
		else if (current_ZT_Number == 2)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_2);

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_2); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_2); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_2); 
		}
		else if (current_ZT_Number == 3)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_3);  

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_3); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.AN_makeup_3); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.AN_safety_3); 
		}
		else if (current_ZT_Number == 4)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_4);

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_4); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_4); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_4); 
		}
		else if (current_ZT_Number == 5)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_5); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_5); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_5); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_5); 
		}
		else if (current_ZT_Number == 6)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_6); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_6); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_6); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_6); 
		}
		else if (current_ZT_Number == 7)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_7); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_7); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_7); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_7); 
		}
		else if (current_ZT_Number == 8)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_8); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_8); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_8); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_8); 
		}
		else if (current_ZT_Number == 9)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_9); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_9); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_9); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_9); 
		}
		else if (current_ZT_Number == 10)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_10); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_10); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_10); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_11); 
		}
		else if (current_ZT_Number == 11)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_11); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_11); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_11); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_11); 
		}
		else if (current_ZT_Number == 12)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_12); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_12); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_12); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_12); 
		}
		else if (current_ZT_Number == 13)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_13); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_13); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_13); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_13); 
		}
		else if (current_ZT_Number == 14)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_14); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_14); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_14); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_14); 
		}
		else if (current_ZT_Number == 15)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_15); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_15); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_15); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_15); 
		}
		else if (current_ZT_Number == 16)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_16); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_16); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_16); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_16); 
		}
		else if (current_ZT_Number == 17)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_17); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_17); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_17); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_17); 
		}
		else if (current_ZT_Number == 18)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_18); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_18); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_18); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_18); 
		}
		else if (current_ZT_Number == 19)										
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_19); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_19); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_19); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_19); 
		}
		else if (current_ZT_Number == 20)
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.ZT_title_20); 

			edit_info = (TextView)findViewById(R.id.part_info);           
			edit_info.setText(R.string.ZT_info_20); 
			
			//edit_makeup = (TextView)findViewById(R.id.part_makeup);           
			//edit_makeup.setText(R.string.CM_makeup_20); 
			
			//edit_safety = (TextView)findViewById(R.id.part_safety);           
			//edit_safety.setText(R.string.CM_safety_20); 
		}
		else
		{
			edit_title = (TextView)findViewById(R.id.part_title);           
			edit_title.setText(R.string.error_text);
		}
	}
}
