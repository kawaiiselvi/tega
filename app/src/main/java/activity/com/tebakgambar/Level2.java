package activity.com.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level2 extends Activity implements View.OnClickListener {
    Button pesanToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        pesanToast = (Button) findViewById(R.id.Buttonbb);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttonaa);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttoncc);
        pesanToast.setOnClickListener((View.OnClickListener) this);


        Button ne1 = (Button) findViewById(R.id.Buttonaa);
        ne1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), L2next1.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.Buttonbb:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttonaa:
                Toast.makeText(this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttoncc:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
        }
    }

}