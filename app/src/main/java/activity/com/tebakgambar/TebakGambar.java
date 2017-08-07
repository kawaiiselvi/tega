package activity.com.tebakgambar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class TebakGambar extends Activity implements View.OnClickListener {
    Button keluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_gambar);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        Button satu = (Button) findViewById(R.id.Button1);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Play.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dua = (Button) findViewById(R.id.exitBtn);
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), TebakGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View infoo) {
                Intent myIntent = new Intent(infoo.getContext(),profil.class);
                startActivityForResult(myIntent,0);
            }
        });

        ImageButton as = (ImageButton) findViewById(R.id.smk);
        as.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View as) {
                Intent myIntent = new Intent(as.getContext(),web.class);
                startActivityForResult(myIntent,0);
            }
        });

    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        TebakGambar.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }

                }).show();
    }
}
