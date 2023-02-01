package com.java.instance;

public class ImageRunner {

	public static void main(String[] args) {
		Image img=new Image();
          img.show();
      	Image img2=new Image(5.5);
        img2.show(); 
    	Image img3=new Image("passport");
        img3.show();
    	Image img4=new Image(4.4,"black");
        img4.show();
    	Image img5=new Image(3.3,true);
        img5.show();
    	Image img6=new Image(true,true);
        img6.show();
    	Image img7=new Image(50,true);
        img7.show();
    	Image img8=new Image(60,"kgjhgd");
        img8.show();
    	Image img9=new Image("small","rectangle");
        img9.show();
    	Image img10=new Image(true,false);
        img10.show();
	}

}
