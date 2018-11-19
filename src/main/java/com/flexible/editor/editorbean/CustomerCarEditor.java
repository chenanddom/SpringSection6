package com.flexible.editor.editorbean;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * �Զ�������Ա༭��
 */
public class CustomerCarEditor extends PropertyEditorSupport {

    //������ֵת��Ϊ�������Ͷ���
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.isEmpty(text)||text.indexOf(",")==-1){
            throw new IllegalArgumentException("���õ��ַ�����ʽ����ȷ");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        //���ø����setValue()��������ת��������Զ���
        setValue(car);
    }
}
