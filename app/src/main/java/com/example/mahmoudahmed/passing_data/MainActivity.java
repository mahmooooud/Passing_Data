package com.example.mahmoudahmed.passing_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView kelo,gon;
    private String bioKelo = "lkdgnahgioadgioahgiahighadigigipgihofoaf"+"opajfopasfopajopadnjfbaofbiafkaklfbasfhiofibfqfuuqfgiefhipejfops"+"jdfopjaopfjasgsaiogsaiohfoagioashgoajsvsjjsbgjabgioawbiogbakdniawefpopehwfewfafasnfbasfiobibqiwfbiqwobiwfbiowbibiqbiqfwbpisioaasfasfyugqiufguiqegfui";
    private String bioGon = "[oponlnbmlfmblmfdbnbcvctyqycvuqnocmc"+",lpmkobhugcfygvhbjnkmlp,pmkonbhugyctfxfcygbhijnompnoj"+"\n"+"bhvcftygvubhiompamkcbhsgvycagasbijcomsaocnjabhvugcsvqwbncm[qpominbv"+"\n"+"qcwbhnjma,cmnabsvcfgashjckasjlcjk;slck;jlghacsjlk;o"+"ascjlhjacslkjaskckhascjlkljqknhqwjmjqnjefjfasasfasfasfg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kelo = findViewById(R.id.kelo);
        gon = findViewById(R.id.gon);

        kelo.setOnClickListener(this);
        gon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.kelo:
                Intent keloIntent = new Intent(MainActivity.this,Data.class);
                keloIntent.putExtra("Kelo",bioKelo);
                keloIntent.putExtra("name","Kelo");
                startActivity(keloIntent);
                break;
            case R.id.gon:
                Intent gonIntent = new Intent(MainActivity.this,Data.class);
                gonIntent.putExtra("Gon",bioGon);
                gonIntent.putExtra("name","Gon");
                startActivity(gonIntent);
                break;

        }
    }
}
