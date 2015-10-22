package com.lhu.samplemediastore;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by Tacademy on 2015-10-22.
 */
public class CheckItemView extends FrameLayout implements Checkable {
    public CheckItemView(Context context) {
        super(context);
        init();
    }

    public CheckItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    ImageView checkView;

    private void init() {
        inflate(getContext(), R.layout.view_item, this);
        checkView = (ImageView)findViewById(R.id.image_check);
    }


    private void drawCheck() {
        if (isChecked) {
            checkView.setImageResource(android.R.drawable.checkbox_on_background);
        } else {
            checkView.setImageResource(android.R.drawable.checkbox_off_background);
        }
    }

    boolean isChecked = false;

    @Override
    public void setChecked(boolean checked) {
        if (isChecked != checked) {
            isChecked = checked;
            drawCheck();
        }
    }

    @Override
    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public void toggle() {
        setChecked(!isChecked);
    }
}
