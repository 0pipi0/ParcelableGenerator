/**
 * ParcelableGenerator ���Կ��ٽ�һ���������ת����Parcelable�����㴫�䣬�����ֶ���дParcelable�����Ĵ��롣
 * ʹ�÷���
 * 1. ����һ����ҪParcelable����Ķ����������Model
 * Model m = new Model();
 * 2. ����Model������ֵ
 * m.set...();
 * 3. ����PG����Parcelable����
 * Parcelable p = PG.createParcelable(m);
 * 4. ��p���䣬������Intent��
 * intent.putExtran("model", p);
 * 5. ��ȡ����ֱ�ӻ�ȡParcelable���Ƹ�ԭ��������
 * Model m = intent.getParcelable("model");
 * 6. ��ȡ���������ֵ
 * m.get...();
 */
package com.baoyz.pg;
