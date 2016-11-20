package me.stark.tony.loadingutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import me.stark.tony.loadingview.LoadDialog;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);



    findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        LoadDialog.show(MainActivity.this);
      }
    });

    findViewById(R.id.btn_hide).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {

      }
    });

  }
}
