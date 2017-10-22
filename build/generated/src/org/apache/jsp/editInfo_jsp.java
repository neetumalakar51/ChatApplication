package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import chat.*;

public final class editInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String nickname = (String)session.getAttribute("nickname");
if (nickname == null)
{
	out.write("<font color=\"red\" size=\"+1\">You have not logged in.</font>");
	out.close();
	return;
}
ChatRoomList roomList = (ChatRoomList)application.getAttribute("chatroomlist");
ChatRoom chatRoom = roomList.getRoomOfChatter(nickname);
if (chatRoom != null)
{
	Chatter chatter = chatRoom.getChatter(nickname);

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta name=\"Author\" content=\"Sukhwinder Singh (ssruprai@hotmail.com\">\r\n");
      out.write("\r\n");
      out.write("<TITLE>Edit your (");
      out.print(chatter.getName());
      out.write("'s) Information\r\n");
      out.write("</TITLE>\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/chat.css\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<FORM name=\"chatterinfo\" method=\"post\"\r\n");
      out.write("\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/servlet/saveInfo\">\r\n");
      out.write("\t\t\t\t<TABLE width=\"80%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\"\r\n");
      out.write("\t\t\t\t\talign=\"center\" bordercolor=\"#6633CC\">\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><h4>Nickname:</h4></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">");
      out.print(chatter.getName());
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"nickname\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(chatter.getName());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><h4>Sex:</h4></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">");
      out.print(chatter.getSex());
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><h4>Age:</h4></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 String temp;
		int age = chatter.getAge();
		if(age == -1)
			temp = "";
		else
			temp = String.valueOf(age);
		
      out.write(" <INPUT type=\"text\" name=\"age\" maxlength=\"2\" size=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(temp);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><h4>Email:</h4></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t");

			temp = chatter.getEmail();
			if(temp == null)
				temp = "Not Specified";			
		
      out.write(" <INPUT type=\"text\" name=\"email\" value=\"");
      out.print(temp);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><h4>Comment:</h4></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 
			temp = chatter.getComment();
			if(temp==null)
				temp = "Not Specified";		
		
      out.write(" <TEXTAREA cols=\"30\" rows=\"5\" wrap=\"VIRTUAL\" name=\"comment\">");
      out.print(temp);
      out.write("</TEXTAREA>\r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t<TD valign=\"top\"><INPUT type=\"submit\" name=\"Submit\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"Save\"></TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</FORM>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");

}
else
{
	out.write("<span class=\"error\">Problem getting room information of the chatter</span>");
}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
