package com.github.pwittchen.swipedetector.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.TextView;
import com.github.pwittchen.swipedetector.library.SwipeDetector;
import com.github.pwittchen.swipedetector.library.SwipeListener;
import pwittchen.com.swipedetector.R;

public class SwipeDetectorActivity extends AppCompatActivity {

  protected TextView info;
  private SwipeDetector swipeDetector;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    info = (TextView) findViewById(R.id.info);
    swipeDetector = new SwipeDetector(createSwipeListener());
  }

  @Override public boolean dispatchTouchEvent(MotionEvent event) {
    swipeDetector.onTouchEvent(event);
    return super.dispatchTouchEvent(event);
  }

  private SwipeListener createSwipeListener() {
    return new SwipeListener() {
      @Override public void onSwipingLeft(final MotionEvent event) {
        info.setText("swiping left");
      }

      @Override public void onSwipedLeft(final MotionEvent event) {
        info.setText("swiped left");
      }

      @Override public void onSwipingRight(final MotionEvent event) {
        info.setText("swiping right");
      }

      @Override public void onSwipedRight(final MotionEvent event) {
        info.setText("swiped right");
      }

      @Override public void onSwipingUp(final MotionEvent event) {
        info.setText("swiping up");
      }

      @Override public void onSwipedUp(final MotionEvent event) {
        info.setText("swiped up");
      }

      @Override public void onSwipingDown(final MotionEvent event) {
        info.setText("swiping down");
      }

      @Override public void onSwipedDown(final MotionEvent event) {
        info.setText("swiped down");
      }
    };
  }
}
