package app.android.intentdataobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveObject extends AppCompatActivity {

    public static final String EXTRA_PERSON ="naufal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        TextView txtName = (TextView) findViewById(R.id.name);
        TextView txtAge = (TextView) findViewById(R.id.age);
        TextView txtEmail = (TextView) findViewById(R.id.email);
        TextView txtCity = (TextView) findViewById(R.id.city);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);

        txtName.setText(mPerson.getName());
        txtEmail.setText(mPerson.getEmail());
        txtAge.setText(mPerson.getAge()+"");
        txtCity.setText(mPerson.getCity());
    }
}
