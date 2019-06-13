package com.appdev.gallery.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.appdev.gallery.lib.R;

/**
 * @author 创建人 ：yaowang
 * @version 1.0
 * @package 包名 ：com.appdev.gallery.lib.view
 * @createTime 创建时间 ：2019/6/13
 * @modifyBy 修改人 ：
 * @modifyTime 修改时间 ：
 * @modifyMemo 修改备注：
 */
public class CustomTitleBar extends RelativeLayout {
    private Context mContext;

    public CustomTitleBar(Context context) {
        super(context,null);
    }

    public CustomTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public CustomTitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        View.inflate(mContext,R.layout.layout_custom_titlebar,this);
    }
}
