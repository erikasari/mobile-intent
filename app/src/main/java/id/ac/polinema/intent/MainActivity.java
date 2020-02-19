package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText nameInput;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicit(View view) {
        Intent intent =  new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }


    public void handleImplicit(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundle(View view) {
        Intent inten = new Intent (this, BundleActivity.class);
        startActivity(inten);

    }

    public void handleParcelable(View view) {
        Intent inten = new Intent (this, ParcelableActivity.class);
        startActivity(inten);
    }
}
