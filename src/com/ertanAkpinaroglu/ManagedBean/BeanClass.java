package com.ertanAkpinaroglu.ManagedBean;


import javax.faces.bean.*;

@ManagedBean(name = "Classbean" , eager = true)
@SessionScoped
public class BeanClass {
		private String name;
		private String buttonName = "Send";
		
		// Getters 
		public String getName(){
			return  name;
		}
		
		public String getButtonName(){
			return buttonName;
		}
		
		// setters
		public void setName(String name){
			this.name = name;
		}
		
		public void setButtonName(String buttonName){
			this.buttonName = buttonName;
		}
		
		// Redirect 
		public String redirectUrl(){
			return "Page2.xhtml?faces-redirect=true";
		}

}
