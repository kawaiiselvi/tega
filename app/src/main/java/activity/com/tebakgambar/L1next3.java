package activity.com.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class L1next3 extends Activity implements View.OnClickListener {
    Button pesanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1next3);

        pesanToast = (Button) findViewById(R.id.But2);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.But1);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.But3);
        pesanToast.setOnClickListener((View.OnClickListener) this);


        Button ne2 = (Button) findViewById(R.id.next4);
        ne2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), L1next4.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.But2:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.But1:
                Toast.makeText(this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.But3:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
        }
    }
}
