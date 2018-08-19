
package cn.yinxm.app;

import android.app.Activity;
import android.os.Bundle;

import cn.yinxm.and_lib.AndLib;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndLib.test();

        AndLib.test6();

    }
}
