package com.idquilmes ;
import com.idquilmes.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.*;
import javax.servlet.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;

@Path("/{holamundo :(?i)holamundo}")
public final  class holamundo_services_rest extends GxRestService
{
   @Context
   private ServletContext myContext;
   @Context
   private javax.servlet.http.HttpServletRequest myServletRequest;
   @Context
   private javax.servlet.http.HttpServletResponse myServletResponse;
   @Path("/{saludo :(?i)saludo}")
   @GET
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response gxep_saludo( ) throws Exception
   {
      super.init( "GET" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      if ( ! processHeaders("holamundo",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      String [] AV5Mensaje = new String[] { "" };
      try
      {
         com.idquilmes.holamundo worker = new com.idquilmes.holamundo(remoteHandle, context);
         worker.gxep_saludo(AV5Mensaje );
         com.idquilmes.holamundo_saludo_RESTInterfaceOUT data = new com.idquilmes.holamundo_saludo_RESTInterfaceOUT();
         data.setMensaje(AV5Mensaje[0]);
         builder = Response.ok(data);
         cleanup();
         return builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @Path("/{saludo :(?i)saludo}")
   @OPTIONS
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response GetOptionssaludo( ) throws Exception
   {
      super.init( "OPTIONS" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      builder = Response.ok();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return builder.build() ;
   }

   @Path("/{procedure1 :(?i)procedure1}")
   @GET
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response gxep_procedure1( ) throws Exception
   {
      super.init( "GET" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      if ( ! processHeaders("holamundo",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.idquilmes.holamundo worker = new com.idquilmes.holamundo(remoteHandle, context);
         worker.gxep_procedure1( );
         builder = Response.ok();
         cleanup();
         return builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @Path("/{procedure1 :(?i)procedure1}")
   @OPTIONS
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response GetOptionsProcedure1( ) throws Exception
   {
      super.init( "OPTIONS" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      builder = Response.ok();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return builder.build() ;
   }

   @Path("/{otroprocedure :(?i)otroprocedure}")
   @GET
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response gxep_otroprocedure( ) throws Exception
   {
      super.init( "GET" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      if ( ! processHeaders("holamundo",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.idquilmes.holamundo worker = new com.idquilmes.holamundo(remoteHandle, context);
         worker.gxep_otroprocedure( );
         builder = Response.ok();
         cleanup();
         return builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @Path("/{otroprocedure :(?i)otroprocedure}")
   @OPTIONS
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response GetOptionsotroProcedure( ) throws Exception
   {
      super.init( "OPTIONS" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      builder = Response.ok();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return builder.build() ;
   }

   @Path("/{algomas :(?i)algomas}")
   @GET
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response gxep_algomas( ) throws Exception
   {
      super.init( "GET" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      if ( ! processHeaders("holamundo",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.idquilmes.holamundo worker = new com.idquilmes.holamundo(remoteHandle, context);
         worker.gxep_algomas( );
         builder = Response.ok();
         cleanup();
         return builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @Path("/{algomas :(?i)algomas}")
   @OPTIONS
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response GetOptionsAlgoMas( ) throws Exception
   {
      super.init( "OPTIONS" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      builder = Response.ok();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return builder.build() ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

