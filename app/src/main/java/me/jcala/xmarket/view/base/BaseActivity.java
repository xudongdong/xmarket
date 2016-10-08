package me.jcala.xmarket.view.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Administrator on 2016/9/6.
 */
public abstract  class BaseActivity extends AppCompatActivity {

    protected String TAG = "BaseActivity";

    protected abstract void initVariables();

    protected abstract void initViews(Bundle savedInstanceState);

    protected void loadData(){}

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getClass().getSimpleName();
        initVariables();
        initViews(savedInstanceState);
        loadData();
    }


}