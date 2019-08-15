package app.android.intentdataobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MoveResult extends AppCompatActivity {

    Button btnSumbit;
    RadioGroup rg_choose;
    public static String EXTRA_SELECTED ="value";
    public static int RESULT_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_result);

        btnSumbit = (Button) findViewById(R.id.btnSubmit);
        rg_choose = (RadioGroup) findViewById(R.id.rg_number);

        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rg_choose.getCheckedRadioButtonId() != 0){

                    int value = 0;
                    switch (rg_choose.getCheckedRadioButtonId()){
                        case R.id.rb_50:
                            value = 50;
                            break;

                        case R.id.rb_100:
                            value = 100;
                            break;

                        case R.id.rb_150:
                            value = 150;
                            break;

                        case R.id.rb_200:
                            value = 200;
                            break;
                    }

                    Intent intent = new Intent();
                    intent.putExtra(EXTRA_SELECTED , value);
                    setResult(RESULT_CODE , intent);
                    finish();

                }

            }
        });

    }
}
