package com.fragment.login.gridviewandlistviewthroughuml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);



        String quotes;
        Intent intent=this.getIntent();
        quotes=intent.getStringExtra("pos");
        TextView textView=(TextView)findViewById(R.id.textvw5);
        textView.setText(quotes);

        Button btn;
        btn=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String msg="Share Button";
                Toast.makeText(MainListActivity.this,String.valueOf(msg),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
