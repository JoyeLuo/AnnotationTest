package com.tmser.annotation;

import java.util.HashMap;
import java.util.Map;

@TestA (name="type",gid = Long.class)//��ע��
public class UserAnnotation
{

    @TestA (name="para",id = 1, gid = Long.class)//���Աע��
    private Integer age;

    @TestA (name="construct",id=2,gid=Long.class)// ʹ���˹��췽��ע��
    public UserAnnotation()
    {
    }

    @TestA(name="public method",id=3,gid=Long.class)  // ʹ�����෽��ע��
    public void a()
    {
        Map m = new HashMap( 0 );
    }

    @TestA(name="protected method",id=4,gid=Long.class) //�෽��ע��
    protected void b(){
    Map m = new HashMap(0);
    }

    @TestA(name="private method",id=5,gid=Long.class) //�෽��ע��
    private void c(){
    Map m = new HashMap(0);
    }

    public void b(Integer a){ 
    }
}
