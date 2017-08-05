package activity.com.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Play extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button satu = (Button) findViewById(R.id.Button01);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Level1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dua = (Button) findViewById(R.id.Button02);
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Level2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tiga = (Button) findViewById(R.id.Button03);
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Level3.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button pat = (Button) findViewById(R.id.Button04);
        pat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Level4.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ma = (Button) findViewById(R.id.Button05);
        ma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Level5.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }
}
