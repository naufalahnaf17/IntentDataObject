package app.android.intentdataobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_satu);

        Intent intent = getIntent();
        String hasil = intent.getStringExtra("hasil");

        TextView txt = (TextView) findViewById(R.id.txtSomeThing);
        txt.setText(hasil);

    }
}
