package com.java.pack;

public class Frame {
       public String shepe;
       public String colour;
       public int size;
       public boolean visible;
       public String type;
       public String madeof;
       public String madeto;
       public boolean pictur;
       public String name;
       public boolean good;
       public boolean vanish;
       
       public Frame(String shepe,String colour,int size,boolean visible,String type,String madeof,String madeto,boolean pictur,String name,boolean good,boolean vanish) {
    	   System.out.println("cont with args!!!!!!!!!!!!");
    	   this.shepe=shepe;
    	   this.colour=colour;
    	   this.size=size;
    	   this.visible=visible;
    	   this.type=type;
    	   this.madeof=madeof;
    	   this.madeto=madeto;
    	   this.pictur=pictur;
    	   this.name=name;
    	   this.good=good;
    	   this.vanish=vanish;
    	   }
       public void show() {
    	   System.out.println("frame shepe is:"+shepe);
    	   System.out.println("frame colour is:"+colour);
    	   System.out.println("frame size is:"+size);
    	   System.out.println("frame is visible to all:"+visible);
    	   System.out.println("frame type is:"+type);
    	   System.out.println("frame is madeUp of:"+madeof);
    	   System.out.println("frame is madeto:"+madeto);
    	   System.out.println("frame is pictur:"+pictur);
    	   System.out.println("frame name is:"+name);
    	   System.out.println("frame is  good:"+good);
    	   System.out.println("frame shepe is:"+shepe);
    	   System.out.println("frame will vanish:"+vanish);
       }
       }

