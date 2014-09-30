package com.example.floatbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn_hide,btn_show;
	private Floatingbutton floatingActionButton ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 btn_hide=(Button)findViewById(R.id.btn_hide);
	        btn_show=(Button)findViewById(R.id.btn_show);
	         floatingActionButton = (Floatingbutton) findViewById(R.id.button_floating_action);
	        btn_hide.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 floatingActionButton.hide();
				}
			});
	        
	        btn_show.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 floatingActionButton.show();
				}
			});
	}


}
