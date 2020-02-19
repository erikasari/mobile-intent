package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {
    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        Bundle bundle = getIntent().getExtras();

    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, ProfileBundleActivity.class);

        String username = usernameInput.getText().toString();
        intent.putExtra("USERNAME_KEY",username);

        String name = nameInput.getText().toString();
        intent.putExtra("NAME_KEY",name);

        String age = ageInput.getText().toString();
        intent.putExtra("AGE_KEY",age);

        startActivity(intent);


    }
}
