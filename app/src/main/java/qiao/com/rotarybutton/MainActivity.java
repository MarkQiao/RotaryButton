package qiao.com.rotarybutton;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  AnalogController bassController,bassController1,bassController2,bassController3;
  public static int themeColor = Color.parseColor("#B24242");
  public static int themeColors = Color.parseColor("#F08080");
  private TextView tv;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    bassController = findViewById(R.id.controllerBass);
    bassController1 = findViewById(R.id.controllerBass1);
    bassController2 = findViewById(R.id.controllerBass2);
    bassController3 = findViewById(R.id.controllerBass3);
    tv = (TextView)findViewById(R.id.tv);
    bassController.setLabel("BASS");
    bassController.circlePaint2.setColor(themeColors);
    bassController.linePaint.setColor(themeColors);
    bassController.invalidate();
    bassController.linePaint.setColor(themeColors);

    bassController1.setLabel("哈哈");
    bassController1.circlePaint2.setColor(themeColors);
    bassController1.linePaint.setColor(themeColors);
    bassController1.invalidate();
    bassController1.linePaint.setColor(themeColors);

    bassController2.setLabel("测试");
    bassController2.circlePaint2.setColor(themeColors);
    bassController2.linePaint.setColor(themeColors);
    bassController2.invalidate();
    bassController2.linePaint.setColor(themeColors);

    bassController3.setLabel("调节");
    bassController3.circlePaint2.setColor(themeColors);
    bassController3.linePaint.setColor(themeColors);
    bassController3.invalidate();
    bassController3.linePaint.setColor(themeColors);

    bassController.setOnProgressChangedListener(new AnalogController.onProgressChangedListener() {
      @Override
      public void onProgressChanged(int progress) {
        tv.setText(progress+"");
      }
    });

    bassController1.setOnProgressChangedListener(new AnalogController.onProgressChangedListener() {
      @Override
      public void onProgressChanged(int progress) {
        tv.setText(progress+"");
      }
    });
    bassController2.setOnProgressChangedListener(new AnalogController.onProgressChangedListener() {
      @Override
      public void onProgressChanged(int progress) {
        tv.setText(progress+"");
      }
    });
    bassController3.setOnProgressChangedListener(new AnalogController.onProgressChangedListener() {
      @Override
      public void onProgressChanged(int progress) {
        tv.setText(progress+"");
      }
    });

  }
}
