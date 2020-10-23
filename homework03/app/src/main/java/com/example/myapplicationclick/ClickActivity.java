package com.example.myapplicationclick;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickActivity extends AppCompatActivity  {

    Activity activity ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        activity = this;
        Button btn_click =  (Button)findViewById(R.id.btn_click);
        btn_click.setOnClickListener(new MyOnclickListener());
        btn_click.setOnLongClickListener(new MyLongClickListener());

    }
    class MyOnclickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            if(view.getId() == R.id.btn_click){
                Toast.makeText(activity,"您点击了控件！:"+((TextView) view).getText(),Toast.LENGTH_LONG).show();
            }
        }
    }

    class MyLongClickListener implements View.OnLongClickListener{
        @Override
        public boolean onLongClick(View view) {

            if(view.getId() == R.id.btn_click){
                Toast.makeText(activity,"您长按了控件！"+((TextView) view).getText(),Toast.LENGTH_LONG).show();
            }
            return true;
        }
    }
}
