package com.baoyz.pg.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowUserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.textView);
		
		// ֱ�ӻ�ȡԭ��������
		User user = getIntent().getParcelableExtra("user");
		
		// ʹ�ö�������ԣ�toString()��������ֵ
		tv.setText(user.toString());
	}

}
