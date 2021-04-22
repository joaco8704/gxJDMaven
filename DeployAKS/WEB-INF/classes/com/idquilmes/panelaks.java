package com.idquilmes ;
import com.idquilmes.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.idquilmes.panelaks", "/com.idquilmes.panelaks"})
public final  class panelaks extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.idquilmes.GXcfg.class);
      com.idquilmes.panelaks_impl pgm = new com.idquilmes.panelaks_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new panelaks_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new panelaks_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Panel AKS";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

