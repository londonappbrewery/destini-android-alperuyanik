package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    int mStoryIndext = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final Button mButtonTop = (Button) findViewById(R.id.buttonTop);
        final Button mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        final TextView mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndext == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mStoryIndext = 2;
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                } else if (mStoryIndext == 2) {
                    mStoryTextView.setText(R.string.T6_End);
                    mStoryIndext = 0;
                } else if (mStoryIndext == 3) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mStoryIndext = 1;
                }



            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndext == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mStoryIndext = 3;
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                } else if (mStoryIndext == 2) {
                    mStoryTextView.setText(R.string.T5_End);
                } else if (mStoryIndext == 3) {
                    mStoryTextView.setText(R.string.T4_End);
                }

            }
        });

    }
}
