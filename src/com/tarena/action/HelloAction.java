package com.tarena.action;

import com.tarena.entity.User;

public class HelloAction {
	  //����ֵ 
	  private String realName;
	  
	  //��ģ��
	  private User user;
	  
	  public HelloAction(){
		  System.out.println("ʵ����Action");
	  }

	/**
	    * 1.������public
	    * 2.����ֵΪString��
	    * 3.�����б�Ϊ�� 
	    * @return
	    */
	   public String sayHello(){
		   //ģ��ҵ���߼�
		   System.out.println("Hello world");
		   
		   //����������Ե�ֵ
		   System.out.println("����:"+realName);
		   /**
		    * ���ص��ַ�������ƥ��һ��result��ǩ
		    * Ȼ������ת����result��ǩ�ж����ҳ��
		    */
		   
		   //�����ģ�͵�ֵ
		   System.out.println("�û���:"+user.getUserName());
		   System.out.println("����:"+user.getPassword());
		   
		   return "ok";
	   }
	   public String getRealName() {
			return realName;
		}


		public void setRealName(String realName) {
			this.realName = realName;
			System.out.println("ע��realName");
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
	   
}
