package com.flexible.editor.editorbean;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * 自定义得属性编辑器
 */
public class CustomerCarEditor extends PropertyEditorSupport {

    //将字面值转换为属性类型对象
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.isEmpty(text)||text.indexOf(",")==-1){
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        //调用父类得setValue()方法设置转换后得属性对象
        setValue(car);
    }
}
