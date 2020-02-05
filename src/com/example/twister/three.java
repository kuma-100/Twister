package com.example.twister;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class three extends Activity {
	private TextView textView1;
	private Button button1;
	private Button button2;
	private Button button3;
	public int clean=0;
	
	private TextView textView00;
	private TextView textView01;
	private TextView textView02;
	private TextView textView03;
	private TextView textView04;
	private TextView textView05;
	private TextView textView10;
	private TextView textView11;
	private TextView textView12;
	private TextView textView13;
	private TextView textView14;
	private TextView textView15;
	private TextView textView20;
	private TextView textView21;
	private TextView textView22;
	private TextView textView23;
	private TextView textView24;
	private TextView textView25;
	private TextView textView30;
	private TextView textView31;
	private TextView textView32;
	private TextView textView33;
	private TextView textView34;
	private TextView textView35;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		SysApplication.getInstance().addActivity(this);  
		setContentView(R.layout.three);
		
		this.textView1=(TextView) findViewById(R.id.textView1);
		this.button1=(Button) findViewById(R.id.button1);
		this.button2=(Button) findViewById(R.id.button2);
		this.button3=(Button) findViewById(R.id.button3);
		
		this.textView00=(TextView) findViewById(R.id.textView00);
		this.textView01=(TextView) findViewById(R.id.textView01);
		this.textView02=(TextView) findViewById(R.id.textView02);
		this.textView03=(TextView) findViewById(R.id.textView03);
		this.textView04=(TextView) findViewById(R.id.textView04);
		this.textView05=(TextView) findViewById(R.id.textView05);
		this.textView10=(TextView) findViewById(R.id.textView10);
		this.textView11=(TextView) findViewById(R.id.textView11);
		this.textView12=(TextView) findViewById(R.id.textView12);
		this.textView13=(TextView) findViewById(R.id.textView13);
		this.textView14=(TextView) findViewById(R.id.textView14);
		this.textView15=(TextView) findViewById(R.id.textView15);
		this.textView20=(TextView) findViewById(R.id.textView20);
		this.textView21=(TextView) findViewById(R.id.textView21);
		this.textView22=(TextView) findViewById(R.id.textView22);
		this.textView23=(TextView) findViewById(R.id.textView23);
		this.textView24=(TextView) findViewById(R.id.textView24);
		this.textView25=(TextView) findViewById(R.id.textView25);
		this.textView30=(TextView) findViewById(R.id.textView30);
		this.textView31=(TextView) findViewById(R.id.textView31);
		this.textView32=(TextView) findViewById(R.id.textView32);
		this.textView33=(TextView) findViewById(R.id.textView33);
		this.textView34=(TextView) findViewById(R.id.textView34);
		this.textView35=(TextView) findViewById(R.id.textView35);
		
		final SharedPreferences hf = getSharedPreferences("threesave", MODE_WORLD_READABLE);
        SharedPreferences.Editor editor = hf.edit();
        editor.putString("0", "左手");
        editor.putString("1", "右手");
        editor.putString("2", "左脚");
        editor.putString("3", "右脚");
        editor.commit();
        final SharedPreferences color = getSharedPreferences("threecolor", MODE_WORLD_READABLE);
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
				switch (clean) {
				case 0:
					textView00.setBackgroundResource(R.drawable.textview_style);
					break;
				case 1:
					textView01.setBackgroundResource(R.drawable.textview_style);
					break;
				case 2:
					textView02.setBackgroundResource(R.drawable.textview_style);
					break;
				case 3:
					textView03.setBackgroundResource(R.drawable.textview_style);
					break;
				case 4:
					textView04.setBackgroundResource(R.drawable.textview_style);
					break;
				case 5:
					textView05.setBackgroundResource(R.drawable.textview_style);
					break;
				case 6:
					textView10.setBackgroundResource(R.drawable.textview_style);
					break;
				case 7:
					textView11.setBackgroundResource(R.drawable.textview_style);
					break;
				case 8:
					textView12.setBackgroundResource(R.drawable.textview_style);
					break;
				case 9:
					textView13.setBackgroundResource(R.drawable.textview_style);
					break;
				case 10:
					textView14.setBackgroundResource(R.drawable.textview_style);
					break;
				case 11:
					textView15.setBackgroundResource(R.drawable.textview_style);
					break;
				case 12:
					textView20.setBackgroundResource(R.drawable.textview_style);
					break;
				case 13:
					textView21.setBackgroundResource(R.drawable.textview_style);
					break;
				case 14:
					textView22.setBackgroundResource(R.drawable.textview_style);
					break;
				case 15:
					textView23.setBackgroundResource(R.drawable.textview_style);
					break;
				case 16:
					textView24.setBackgroundResource(R.drawable.textview_style);
					break;
				case 17:
					textView25.setBackgroundResource(R.drawable.textview_style);
					break;
				case 18:
					textView30.setBackgroundResource(R.drawable.textview_style);
					break;
				case 19:
					textView31.setBackgroundResource(R.drawable.textview_style);
					break;
				case 20:
					textView32.setBackgroundResource(R.drawable.textview_style);
					break;
				case 21:
					textView33.setBackgroundResource(R.drawable.textview_style);
					break;
				case 22:
					textView34.setBackgroundResource(R.drawable.textview_style);
					break;
				case 23:
					textView35.setBackgroundResource(R.drawable.textview_style);
					break;

				default:
					break;
				}
				
				
				int left = (int)(Math.random()*4);
				int right = (int)(Math.random()*24);
				textView1.setText(hf.getString(String.valueOf(left), ""));
				clean=right;
				
				
				switch (right) {
				case 0:
					textView00.setBackgroundResource(R.drawable.textview_red);
					break;
				case 1:
					textView01.setBackgroundResource(R.drawable.textview_red);
					break;
				case 2:
					textView02.setBackgroundResource(R.drawable.textview_red);
					break;
				case 3:
					textView03.setBackgroundResource(R.drawable.textview_red);
					break;
				case 4:
					textView04.setBackgroundResource(R.drawable.textview_red);
					break;
				case 5:
					textView05.setBackgroundResource(R.drawable.textview_red);
					break;
				case 6:
					textView10.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 7:
					textView11.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 8:
					textView12.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 9:
					textView13.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 10:
					textView14.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 11:
					textView15.setBackgroundResource(R.drawable.textview_blue);
					break;
				case 12:
					textView20.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 13:
					textView21.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 14:
					textView22.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 15:
					textView23.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 16:
					textView24.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 17:
					textView25.setBackgroundResource(R.drawable.textview_yello);
					break;
				case 18:
					textView30.setBackgroundResource(R.drawable.textview_green);
					break;
				case 19:
					textView31.setBackgroundResource(R.drawable.textview_green);
					break;
				case 20:
					textView32.setBackgroundResource(R.drawable.textview_green);
					break;
				case 21:
					textView33.setBackgroundResource(R.drawable.textview_green);
					break;
				case 22:
					textView34.setBackgroundResource(R.drawable.textview_green);
					break;
				case 23:
					textView35.setBackgroundResource(R.drawable.textview_green);
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
				intent.setClass(three.this, two.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
        
        this.button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(three.this, MainActivity.class);
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
