package carbon.drawable;

import android.content.Context;
import android.content.res.ColorStateList;

import carbon.Carbon;
import carbon.R;

public class DefaultIconColorPrimaryInverseStateList extends ColorStateList {
    public DefaultIconColorPrimaryInverseStateList(Context context) {
        super(new int[][]{
                new int[]{-android.R.attr.state_enabled},
                new int[]{R.attr.carbon_state_invalid},
                new int[]{android.R.attr.state_checked},
                new int[]{android.R.attr.state_activated},
                new int[]{android.R.attr.state_selected},
                new int[]{android.R.attr.state_focused},
                new int[]{}
        }, new int[]{
                Carbon.getThemeColor(context, R.attr.carbon_colorDisabledInverse),
                Carbon.getThemeColor(context, R.attr.carbon_colorError),
                Carbon.getThemeColor(context, R.attr.colorPrimary),
                Carbon.getThemeColor(context, R.attr.colorPrimary),
                Carbon.getThemeColor(context, R.attr.colorPrimary),
                Carbon.getThemeColor(context, R.attr.colorPrimary),
                Carbon.getThemeColor(context, R.attr.carbon_iconColorInverse)
        });
    }
}
