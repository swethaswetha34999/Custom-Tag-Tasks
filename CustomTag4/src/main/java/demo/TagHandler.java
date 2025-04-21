package demo;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport{
	private double pi=3.14;
	private float r;
	
	
	
	public float getR() {
		return r;
	}



	public void setR(float r) {
		this.r = r;
	}



	@Override
	public void doTag() throws IOException
	{
		JspWriter js=getJspContext().getOut();
		js.print("Area of the Circle : "+(pi*r*r));
		
	}

}
