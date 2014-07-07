package com.baoyz.pg.sample;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;

import com.baoyz.pg.PG;
import com.baoyz.pg.PGUtils;
import com.baoyz.pg.sample.model.Classroom;
import com.baoyz.pg.sample.model.Student;
import com.baoyz.pg.sample.model.Teacher;
import com.baoyz.pg.sample.model.User;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void showUser(View v) {
		// �����

		// ���ö��������
		User user = new User();
		user.setName("zhangsan");
		user.setAge(18);
		user.setBalance(100.85);
		user.setId(11111l);
		user.setVip(true);
		user.setAlias(Arrays.asList("alias1", "alias2", "alias3"));
		
		Intent intent = new Intent(this, ShowUserActivity.class);
		// ����PG������ת����Parcelable������Intent
		intent.putExtra("user", PG.convertParcelable(user));
		startActivity(intent);
	}

	public void showClassroom(View v) {
		// �������
		// �������д��������������List�а����������󣬶���Щ���󲻿����л���ֱ�Ӵ��ݽ�����null
		// ����PG.convert()���������л�����תΪ�����л����󣬷���������ԭ����һ�¡���Ȼ��������Ҫ@Parcelable����
		// ���ö��������
		Classroom room = new Classroom();
		Teacher teacher = new Teacher("teacherName", "course");
		// ת��Ϊ�����л�����
		room.setTeacher(PG.convert(teacher));
		List<Student> students = new ArrayList<Student>();
		// ת��Ϊ�����л�����
		students.add(PG.convert(new Student("stu1", 18)));
		students.add(PG.convert(new Student("stu2", 19)));
		students.add(PG.convert(new Student("stu3", 20)));
		room.setStudents(students);

		Intent intent = new Intent(this, ShowClassroomActivity.class);
		// ����PG������ת����Parcelable������Intent
		intent.putExtra("classroom", PG.convertParcelable(room));
		startActivity(intent);
	}

}
