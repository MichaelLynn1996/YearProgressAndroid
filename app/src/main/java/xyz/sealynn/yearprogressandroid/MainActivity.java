package xyz.sealynn.yearprogressandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.widget.ProgressBar;

import xyz.sealynn.yearprogressandroid.utils.DateUtils;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    AppCompatTextView percent;
    AppCompatTextView year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        initDate();
    }

    private void initDate() {
        year.setText(DateUtils.getYear());
        percent.setText(DateUtils.getPercentsofTheYearPassed());
        progressBar.setProgress(DateUtils.getFloatofTheYearPassed());
    }

    private void findViewById() {
        progressBar = findViewById(R.id.progress_bar);
        percent = findViewById(R.id.tv_percent);
        year = findViewById(R.id.tv_year);
    }
}
