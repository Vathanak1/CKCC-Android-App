package kh.edu.rupp.ckcc.ckcc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * CKCC
 * Created by leapkh on 3/13/18.
 */

public class LoginActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        // Reference to TextView NotNow
        TextView txtNotNow = findViewById(R.id.txt_not_now);

        // Assign onclick listener to TextView NotNow
        txtNotNow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Start MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        // Finish current activity
        finish();

    }

}






















