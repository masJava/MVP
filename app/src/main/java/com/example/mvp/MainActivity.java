package com.example.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements MainView {

    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    private Presenter mPresenter = new Presenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = findViewById(R.id.btnCounter1);
        btnCounter2 = findViewById(R.id.btnCounter2);
        btnCounter3 = findViewById(R.id.btnCounter3);
        btnCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.buttonClick(Presenter.ButtonIndex.FIRST);
            }
        });
        btnCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.buttonClick(Presenter.ButtonIndex.SECOND);
            }
        });
        btnCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.buttonClick(Presenter.ButtonIndex.THIRD);
            }
        });

    }

    @Override
    public void setButtonText(Presenter.ButtonIndex index, int value) {
        switch (index) {
            case FIRST:
                btnCounter1.setText("Количество = " + value);
                break;
            case SECOND:
                btnCounter2.setText("Количество = " + value);
                break;
            case THIRD:
                btnCounter3.setText("Количество = " + value);
                break;
        }
    }

}
