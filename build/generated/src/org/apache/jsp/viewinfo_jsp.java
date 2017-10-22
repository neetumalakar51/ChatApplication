package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import chat.*;

public final class viewinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String nickname = request.getParameter("chatterName");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta name=\"Author\" content=\"Sukhwinder Singh (ssruprai@hotmail.com\">\r\n");
      out.write("<TITLE>");
      out.print(nickname);
      out.write("'s information</TITLE>\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/chat.css\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t");

if (nickname != null)
{
	ChatRoomList roomList = (ChatRoomList)application.getAttribute("chatroomlist");
ChatRoom chatRoom = roomList.getRoomOfChatter(nickname);
if (chatRoom != null)
{
Chatter chatter = chatRoom.getChatter(nickname);

      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\"><h4>Nickname:</h4></td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">");
      out.print(nickname);
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\"><h4>Sex:</h4></td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">");
      out.print(chatter.getSex());
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\"><h4>Age:</h4></td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t");
 int age = chatter.getAge();
		if(age == -1)
		out.write("Not specified");
		else
		out.write(String.valueOf(age));
		
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\"><h4>Email:</h4></td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t");
 String email = chatter.getEmail();
			 if (email != null && email.length() >0)
			  	 out.write(email);
			 else
				 out.write("Not specified");
		
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\"><H4>Comment:</h4></td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t");

				String comment = chatter.getComment();
				if (comment != null && comment.length() >0)
					out.write(comment);
				else
					out.write("Not specified");
			
      out.write("</h4>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<form name=\"closing\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" onClick=\"window.close()\" value=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");

}
else
{


      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<span class=\"error\">User ");
      out.print(nickname );
      out.write(" doesn't exist.<br>He\r\n");
      out.write("\t\t\t\t/ She may have logged out.\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t<form name=\"closing\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" onClick=\"window.close()\" value=\"Close\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

}
}
else
{

      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<span class=\"error\">No username provided.</span>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
