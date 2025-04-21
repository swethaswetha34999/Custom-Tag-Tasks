package demo;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport{
	private int m1,m2,m3,m4,m5;
	
	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}

	@Override
	public void doTag() throws IOException
	{
		JspWriter js=getJspContext().getOut();
		js.print("Total "+(m1+m2+m3+m4+m5));
		
		js.print("<br>Average "+((m1+m2+m3+m4+m5)/5));
	
	}
	

}
