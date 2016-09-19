package cn.edu.gdmec.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Work2","onStart方法执行");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.v("Work2","onPostResume方法执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Work2","onPause方法执行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Work2","onStop方法执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Work2","onRestart方法执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Work2","onDestroy方法执行");
    }
}

