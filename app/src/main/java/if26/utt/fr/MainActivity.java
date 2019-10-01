package if26.utt.fr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById (R.id.textview);
        tx.setText(this.getResources().getString(R.string.message));

        Button bt = (Button) findViewById(R.id.myButton); bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { tx.setBackgroundColor(Color.RED);
            } });
    }


}
