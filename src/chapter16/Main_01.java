package chapter16;

import java.lang.reflect.Constructor;

public class Main_01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> emampleC=Class.forName("chapter16.Example_01");
		Constructor[] declaredConstructors=emampleC.getDeclaredConstructors();
		for(int i=0;i<declaredConstructors.length;i++){
			Constructor constructor=declaredConstructors[i];
			System.out.println("查看是否允许带有可变数量的参数："+constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			Class[]parameterTypes=constructor.getParameterTypes();
			for(int j=0;j<parameterTypes.length;j++){
				System.out.println("     "+parameterTypes[j]);
			}
			System.out.println("该构造方法可能抛出的异常类型为：");
			//获得所有可能抛出的异常类型信息
			Class[]exceptionTypes=constructor.getExceptionTypes();
			for(int j=0;j<exceptionTypes.length;j++){
				System.out.println(""+exceptionTypes[j]);
			}
			Example_01 example2=null;
			while(example2==null){
				try {
					if(i==2){
						example2=(Example_01)constructor.newInstance();
					}
					else if(i==1){
						example2=(Example_01)constructor.newInstance("7",5);
					}
					else{
						Object[]parameters=new Object[]{new String[]{"100","200","300"}};
						example2=(Example_01)constructor.newInstance(parameters);
					}
				} catch (Exception e) {
					System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
					constructor.setAccessible(true);
				}
			}
			example2.print();
			System.out.println();
		}
	}
}
