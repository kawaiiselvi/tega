package activity.com.tebakgambar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level1 extends Activity implements View.OnClickListener {
    Button pesanToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        pesanToast = (Button) findViewById(R.id.Buttonb);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttona);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttonc);
        pesanToast.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.Buttonb:
                Toast.makeText(this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttona:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttonc:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
        }
    }

}
