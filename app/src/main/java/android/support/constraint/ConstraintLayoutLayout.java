package android.support.constraint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ConstraintLayoutLayout extends View {
    public ConstraintLayoutLayout(Context context) {
        this(context, null);
    }

    public ConstraintLayoutLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ConstraintLayoutLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
