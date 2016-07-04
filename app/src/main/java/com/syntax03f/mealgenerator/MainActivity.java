package com.syntax03f.mealgenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.syntax03f.mealgenerator.adapters.MealRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.meal_list)
    RecyclerView mealList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initMealList();
    }

    @OnClick(R.id.add_fab)
    public void addMeal() {
        // Add meal
    }

    public void initMealList() {
        mealList.setLayoutManager(new LinearLayoutManager(this));
        MealRecyclerAdapter adapter = new MealRecyclerAdapter();
        mealList.setAdapter(adapter);
    }

}
