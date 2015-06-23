package pl.michalz.hideonscrollexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import pl.michalz.hideonscrollexample.R;
import pl.michalz.hideonscrollexample.activity.partone.PartOneActivity;
import pl.michalz.hideonscrollexample.activity.partthree.PartThreeActivity;
import pl.michalz.hideonscrollexample.activity.parttwo.PartTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button partOneButton;
    private Button partTwoButton;
    private Button partThreeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();

        partOneButton = (Button) findViewById(R.id.partOneButton);
        partTwoButton = (Button) findViewById(R.id.partTwoButton);
        partThreeButton = (Button) findViewById(R.id.partThreeButton);

        partOneButton.setOnClickListener(this);
        partTwoButton.setOnClickListener(this);
        partThreeButton.setOnClickListener(this);
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
    }

    @Override
    public void onClick(View v) {
        if(v.equals(partOneButton)) {
            startActivity(PartOneActivity.class);
        } else if(v.equals(partTwoButton)) {
            startActivity(PartTwoActivity.class);
        } else {
            startActivity(PartThreeActivity.class);
        }
    }

    private void startActivity(Class<?> activityClass) {
        Intent myIntent = new Intent(this, activityClass);
        startActivity(myIntent);
    }
}
