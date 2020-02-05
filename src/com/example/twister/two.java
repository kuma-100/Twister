package com.example.twister;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class two extends Activity {
	private TextView textView1;
	private TextView textView2;
	private Button button1;
	private Button button2;
	private Button button3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		SysApplication.getInstance().addActivity(this);  
		setContentView(R.layout.two);
		this.textView1=(TextView) findViewById(R.id.textView1);
        this.textView2=(TextView) findViewById(R.id.textView2);
        this.button1=(Button) findViewById(R.id.button1);
        this.button2=(Button) findViewById(R.id.button2);
        this.button3=(Button) findViewById(R.id.button3);
        
        final SharedPreferences hf = getSharedPreferences("twosave", MODE_WORLD_READABLE);
        SharedPreferences.Editor editor = hf.edit();
        editor.putString("0", "左手");
        editor.putString("1", "右手");
        editor.putString("2", "左脚");
        editor.putString("3", "右脚");
        editor.commit();
        final SharedPreferences color = getSharedPreferences("twocolor", MODE_WORLD_READABLE);
        SharedPreferences.Editor cl = color.edit();
        cl.putString("0", "红色");
        cl.putString("1", "蓝色");
        cl.putString("2", "黄色");
        cl.putString("3", "绿色");
        cl.putString("4", "空中");
        cl.putString("5", "指定");
        cl.commit();
        
        this.button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int left = (int)(Math.random()*4);
				int right = (int)(Math.random()*6);
				textView1.setText(hf.getString(String.valueOf(left), ""));
				textView2.setText(color.getString(String.valueOf(right), ""));
				switch (right) {
				case 0:
					textView2.setTextColor(Color.parseColor("#FF6666"));
					break;
				case 1:
					textView2.setTextColor(Color.parseColor("#0099CC"));
					break;
				case 2:
					textView2.setTextColor(Color.parseColor("#FFFF00"));
					break;
				case 3:
					textView2.setTextColor(Color.parseColor("#99CC66"));
					break;
				case 4:
					textView2.setTextColor(Color.parseColor("#000000"));
					break;
				case 5:
					textView2.setTextColor(Color.parseColor("#000000"));
					break;

				default:
					break;
				}
			}
		});
        
        this.button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(two.this, MainActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
        
        this.button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(two.this, three.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		SysApplication.getInstance().exit();  
		return super.onOptionsItemSelected(item);
	}
	

}
