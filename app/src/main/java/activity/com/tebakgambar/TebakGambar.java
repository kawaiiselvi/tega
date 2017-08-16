package activity.com.tebakgambar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class TebakGambar extends Activity implements View.OnClickListener {
    MediaPlayer mp;
    private Button btnOn;
    private Button btnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_gambar);




        Button satu = (Button) findViewById(R.id.Button1);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Play.class);
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

        Button aaa = (Button) findViewById(R.id.Ajaib);
        aaa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), KunciJawaban.class);
                startActivityForResult(myIntent, 0);
            }
        });

        btnOff = (Button) findViewById(R.id.btnOFF);
        btnOn=(Button)findViewById(R.id.btnON);
        btnOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                btnOn.setEnabled(false);
                go();
            }
        });

    }

    public void go() {
        mp = MediaPlayer.create(TebakGambar.this, R.raw.sound);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }

            public void OnCompltetion(MediaPlayer arg0) {
                btnOn.setEnabled(true);
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }

    public void stateAwal(){
        btnOff.setEnabled(false);
    }

    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
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

    @Override
    public void onClick(View v) {

    }
}
