package activity.com.tebakgambar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KunciJawaban extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunci_jawaban);

        Button aaa = (Button) findViewById(R.id.button8);
        aaa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), k1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button bbb = (Button) findViewById(R.id.button9);
        bbb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), k2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ccc = (Button) findViewById(R.id.button11);
        ccc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), k3.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ddd = (Button) findViewById(R.id.button12);
        ddd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), k4.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button eee = (Button) findViewById(R.id.button13);
        eee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), k5.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
