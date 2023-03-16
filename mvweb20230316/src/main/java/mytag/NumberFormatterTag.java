package mytag;

//NumberFormatterTag

import java.io.IOException;
import java.text.DecimalFormat; //把數字格式轉為字串格式的文件
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport; 
public class NumberFormatterTag extends SimpleTagSupport {
     private String format;
    private String number;
     public NumberFormatterTag() {
    }
     //Tomcat會用這兩個set去給變數format和number元素
     public void setFormat(String format) {
        this.format = format;
    }
     public void setNumber(String number) {
        this.number = number;
    }
     @Override
    public void doTag() throws JspException, IOException {
        System.out.println("Number is:" + number);
        System.out.println("Format is:" + format);
        try {
            double amount = Double.parseDouble(number); //文字轉成double
            DecimalFormat formatter = new DecimalFormat(format);
            String formattedNumber = formatter.format(amount);
            getJspContext().getOut().write(formattedNumber);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SkipPageException("Exception in formatting " + number
                    + " with format " + format);
        }
    }}

