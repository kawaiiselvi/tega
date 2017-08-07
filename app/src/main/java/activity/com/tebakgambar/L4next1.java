package activity.com.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class L4next1 extends Activity implements View.OnClickListener {
    Button pesanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l4next1);

        pesanToast = (Button) findViewById(R.id.Buttonaa);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttonbb);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttoncc);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        Button ne2 = (Button) findViewById(R.id.next2);
        ne2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), L4next2.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.Buttonaa:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttonbb:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT) .show();
                break;
            case R.id.Buttoncc:
                Toast.makeText(this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT) .show();
                break;
        }
    }
}
