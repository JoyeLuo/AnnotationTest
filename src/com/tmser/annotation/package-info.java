/** 
 * <b>package-info不是平常类，其作用有三个:</b><br> 
 * 1、为标注在包上Annotation提供便利；<br> 
 * 2、声明包的私有类和常量；<br> 
 * 3、提供包的整体注释说明。<br>  
*/  
//使用了包注解
package com.tmser.annotation;

//这里是包类，声明一个包使用的公共类，强调的是包访问权限  
class PkgClass{  
  public void test(){  
  }  
}

//包常量，只运行包内访问，适用于分“包”开发  
class PkgConst{  
  static final String PACAKGE_CONST="ABC";  
}  