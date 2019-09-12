package com.tarena.action;

import com.tarena.entity.User;

public class HelloAction {
	  //基本值 
	  private String realName;
	  
	  //域模型
	  private User user;
	  
	  public HelloAction(){
		  System.out.println("实例化Action");
	  }

	/**
	    * 1.方法是public
	    * 2.返回值为String类
	    * 3.参数列表为空 
	    * @return
	    */
	   public String sayHello(){
		   //模拟业务逻辑
		   System.out.println("Hello world");
		   
		   //输出基本属性的值
		   System.out.println("姓名:"+realName);
		   /**
		    * 返回的字符串用于匹配一个result标签
		    * 然后请求转发给result标签中定义的页面
		    */
		   
		   //输出域模型的值
		   System.out.println("用户名:"+user.getUserName());
		   System.out.println("密码:"+user.getPassword());
		   
		   return "ok";
	   }
	   public String getRealName() {
			return realName;
		}


		public void setRealName(String realName) {
			this.realName = realName;
			System.out.println("注入realName");
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
	   
}
