package app.android.intentdataobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MoveData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        final EditText eSomeThing = (EditText) findViewById(R.id.eSomeThing);
        Button btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String something = eSomeThing.getText().toString().trim();
                Intent intent = new Intent(MoveData.this ,HasilSatu.class);
                intent.putExtra("hasil" , something);
                startActivity(intent);
            }
        });
    }
}
