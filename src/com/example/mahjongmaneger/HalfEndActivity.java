package com.example.mahjongmaneger;

import com.example.mahjongmaneger.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class HalfEndActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.half_zhuang_end);

		Button btn = (Button) findViewById(R.id.btnEndHalfGame);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// オブジェクトを取得
				EditText editText1 = (EditText) findViewById(id.edittext1);
				EditText editText2 = (EditText) findViewById(id.edittext2);
				EditText editText3 = (EditText) findViewById(id.edittext3);
				EditText editText4 = (EditText) findViewById(id.edittext4);
				TextView txtResult1 = (TextView) findViewById(R.id.txtResult1);
				TextView txtResult2 = (TextView) findViewById(R.id.txtResult2);
				TextView txtResult3 = (TextView) findViewById(R.id.txtResult3);
				TextView txtResult4 = (TextView) findViewById(R.id.txtResult4);

				// 入力内容を取得
				String[] strNum = new String[4];
				strNum[0] = editText1.getText().toString();
				strNum[1] = editText2.getText().toString();
				strNum[2] = editText3.getText().toString();
				strNum[3] = editText4.getText().toString();

				// 数値に変換
				int[] num = new int[4];
				for (int i = 0; i < num.length; i++) {
					num[i] = Integer.parseInt(strNum[i]);
				}

				// 点数計算
				int[] point = new int[4];
				int max = -100000;
				int max_player = 0;
				for (int j = 0; j < num.length; j++) {
					point[j] = (Math.round(num[j]) - 30000) / 1000;
					if (max < point[j]) {
						max = point[j];
						max_player = j;
					}
				}
				int top_point = 0;
				for (int i = 0; i < point.length; i++) {
					if (i != max_player) {
						top_point += point[i];
					}
				}
				point[max_player] = -top_point;

				// 結果表示用テキストに設定
				txtResult1.setText(Integer.toString(point[0]));
				txtResult2.setText(Integer.toString(point[1]));
				txtResult3.setText(Integer.toString(point[2]));
				txtResult4.setText(Integer.toString(point[3]));

			}
		});

	}

}
