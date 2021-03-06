package cultoftheunicorn.marvel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.opencv.cultoftheunicorn.marvel.R;


public class UserActivity extends AppCompatActivity {

    private static final String TAG = "UserActivity";

    private TextView greetingTextView;
    private Button btnLogOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("username");
        greetingTextView = (TextView) findViewById(R.id.greeting_text_view);
        btnLogOut = (Button) findViewById(R.id.logout_button);
        greetingTextView.setText("Hello Officer "+ user);
        // Progress dialog
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(in);
            }
        });
        btnLogOut.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(UserActivity.this, HomeActivity.class));
            }
        });
    }
}


