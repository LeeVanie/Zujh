package com.lee.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.lee.componentlib.IMineInter;

public class MineService implements IMineInter {
    @Override
    public void launch(Context context, int mineId) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.putExtra(MineActivity.class.getName(), mineId);
        context.startActivity(intent);
    }
}
