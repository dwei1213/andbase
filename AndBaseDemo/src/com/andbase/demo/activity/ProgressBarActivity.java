package com.andbase.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ab.activity.AbActivity;
import com.ab.view.titlebar.AbTitleBar;
import com.andbase.R;
import com.andbase.global.MyApplication;
/**
 * 名称：ProgressBarActivity
 * 描述：2种漂亮的进度条
 * @author zhaoqp
 * @date 2011-12-13
 * @version
 */
public class ProgressBarActivity extends AbActivity {
	
	private MyApplication application;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setAbContentView(R.layout.progress_bar_main);
        
        AbTitleBar mAbTitleBar = this.getTitleBar();
        mAbTitleBar.setTitleText(R.string.progressbar_name);
        mAbTitleBar.setLogo(R.drawable.button_selector_back);
        mAbTitleBar.setTitleBarBackground(R.drawable.top_bg);
        mAbTitleBar.setTitleTextMargin(10, 0, 0, 0);
        mAbTitleBar.setLogoLine(R.drawable.line);
	    
        application = (MyApplication)abApplication;
        Button mCircleView  = (Button)this.findViewById(R.id.mCircleView);
        Button mHorizontalView  = (Button)this.findViewById(R.id.mHorizontalView);
        
        mCircleView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ProgressBarActivity.this,ProgressBarCircleActivity.class); 
 				startActivity(intent);
			}
		});
        
        mHorizontalView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ProgressBarActivity.this,ProgressBarHorizontalActivity.class); 
 				startActivity(intent);
			}
		});
       
      } 
    
}
