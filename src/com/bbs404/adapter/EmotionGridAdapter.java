package com.bbs404.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bbs404.ui.view.ViewHolder;
import com.bbs404.R;
import com.bbs404.util.EmotionUtils;
import com.bbs404.util.Logger;

public class EmotionGridAdapter extends BaseListAdapter<String> {

    public EmotionGridAdapter(Context ctx) {
        super(ctx);
    }

    @Override
    public View getView(int position, View conView, ViewGroup parent) {
        if (conView == null) {
            LayoutInflater inflater = LayoutInflater.from(ctx);
            conView = inflater.inflate(R.layout.chat_emotion_item, null);
        }
        ImageView emotionImageView = ViewHolder.findViewById(conView, R.id.emotionImageView);
        String emotion = (String) getItem(position);
        emotion = emotion.substring(1);
        Bitmap bitmap = EmotionUtils.getDrawableByName(ctx, emotion);
        emotionImageView.setImageBitmap(bitmap);
        return conView;
    }
}
