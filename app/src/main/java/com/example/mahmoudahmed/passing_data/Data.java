    package com.example.mahmoudahmed.passing_data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


    public class Data extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageView = findViewById(R.id.iv_person);
        textView = findViewById(R.id.tv_person);

        bundle = getIntent().getExtras();
        if(bundle != null)
        {
            textView.setText("455"+"\n");
            String name = bundle.getString("name");
            showBioDetails(name);
        }
    }
    public void showBioDetails(String name)
    {
        if(name.equals("Kelo"))
        {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.kelo));
            textView.setText(bundle.getString(name));
        }
        else if(name.equals("Gon"))
        {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.img_20170822_wa0005));
            textView.setText(bundle.getString(name));
        }
    }
}
