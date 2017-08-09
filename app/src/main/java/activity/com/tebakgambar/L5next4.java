package activity.com.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class L5next4 extends Activity implements View.OnClickListener {
    Button pesanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l5next4);

        pesanToast = (Button) findViewById(R.id.Buttonaaa);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttonbbb);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        pesanToast = (Button) findViewById(R.id.Buttonccc);
        pesanToast.setOnClickListener((View.OnClickListener) this);

        Button ne2 = (Button) findViewById(R.id.Buttonbbb);
        ne2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Play.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.Buttonaaa:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Buttonbbb:
                Toast.makeText(this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Buttonccc:
                Toast.makeText(this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
