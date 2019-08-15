package app.android.intentdataobject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnMove , btnMoveData , btnMoveObject , btnMoveDial , btnMoveResult;
    TextView txtHasil;
    private int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = (Button) findViewById(R.id.btnMove);
        btnMoveData = (Button) findViewById(R.id.btnMoveData);
        btnMoveObject = (Button) findViewById(R.id.btnMoveObject);
        btnMoveDial = (Button) findViewById(R.id.btnDialPhone);
        btnMoveResult = (Button) findViewById(R.id.btnMoveResult);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Move.class);
                startActivity(intent);
            }
        });

        btnMoveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MoveData.class);
                startActivity(intent);
            }
        });

        btnMoveObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person mPerson = new Person();
                mPerson.setName("Naufal Ahnaf");
                mPerson.setEmail("naufalahnaf37@gmail.com");
                mPerson.setAge(17);
                mPerson.setCity("Bandung");
                Intent intent = new Intent(MainActivity.this,MoveObject.class);
                intent.putExtra(MoveObject.EXTRA_PERSON,mPerson);
                startActivity(intent);
            }
        });

        btnMoveDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "082116102109";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                startActivity(intent);
            }
        });

        btnMoveResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MoveResult.class);
                startActivityForResult(intent , REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            if (resultCode == MoveResult.RESULT_CODE){
                int selected = data.getIntExtra(MoveResult.EXTRA_SELECTED , 0);
                txtHasil.setText(String.format("Hasil : %s" , selected));
            }
        }

    }
}
