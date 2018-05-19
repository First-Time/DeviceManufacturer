package com.lyf.rrx.devicemanufacturer;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_manufacturer)
    TextView tvManufacturer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String manufacturer = Build.MANUFACTURER;
        switch (manufacturer.toUpperCase()) {
            case "HUAWEI":
                tvManufacturer.setText("华为");
                break;
            case "MEIZU":
                tvManufacturer.setText("魅族");
                break;
            case "XIAOMI":
                tvManufacturer.setText("小米");
                break;
            case "SONY":
                tvManufacturer.setText("索尼");
                break;
            case "OPPO":
                tvManufacturer.setText("oppo");
                break;
            case "LGE":
                tvManufacturer.setText("LG");
                break;
            case "VIVO":
                tvManufacturer.setText("vivo");
                break;
            case "SAMSUNG":
                tvManufacturer.setText("三星");
                break;
            case "LETV":
                tvManufacturer.setText("乐视");
                break;
            case "ZTE":
                tvManufacturer.setText("中兴");
                break;
            case "YULONG":
                tvManufacturer.setText("酷派");
                break;
            case "LENOVO":
                tvManufacturer.setText("联想");
                break;
            default:
                tvManufacturer.setText("未知");
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
