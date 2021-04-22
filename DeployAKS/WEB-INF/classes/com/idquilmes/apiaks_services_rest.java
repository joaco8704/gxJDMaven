package com.idquilmes ;
import com.idquilmes.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.*;
import javax.servlet.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;

@Path("/{apiaks :(?i)apiaks}")
public final  class apiaks_services_rest extends GxRestService
{
   @Context
   private ServletContext myContext;
   @Context
   private javax.servlet.http.HttpServletRequest myServletRequest;
   @Context
   private javax.servlet.http.HttpServletResponse myServletResponse;
   @Path("/{procedureaks :(?i)procedureaks}")
   @GET
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response gxep_procedureaks( ) throws Exception
   {
      super.init( "GET" , myServletRequest, myServletResponse, myContext);
      ApplicationContext.getInstance().setServletEngineDefaultPath(myContext.getRealPath("/"));
      Response.ResponseBuilder builder = null;
      permissionPrefix = "apiaks_Services_Execute";
      if ( ! isAuthenticated(myServletRequest) )
      {
         if ( forbidden )
         {
            builder = Response.status(Response.Status.FORBIDDEN);
         }
         else
         {
            setWWWAuthHeader(myServletRequest, myServletResponse);
            builder = Response.status(Response.Status.UNAUTHORIZED);
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return builder.build() ;
      }
      if ( ! processHeaders("apiaks",myServletRequest,myServletResponse) )
      {
         builder = Response.notModified();
         cleanup();
         return builder.build();
      }
      try
      {
         com.idquilmes.apiaks worker = new com.idquilmes.apiaks(remoteHandle, context);
         worker.gxep_procedureaks( );
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

   @Path("/{procedureaks :(?i)procedureaks}")
   @OPTIONS
   @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public Response GetOptionsprocedureAKS( ) throws Exception
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
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_HIGH;
   }

}

