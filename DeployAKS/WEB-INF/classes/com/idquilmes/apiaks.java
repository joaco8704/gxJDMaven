package com.idquilmes ;
import com.idquilmes.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiaks extends GXProcedure
{
   public apiaks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiaks.class ), "" );
   }

   public apiaks( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
      Gx_restmethod = ((HttpContext)(context.getHttpContext())).getRequestMethod() ;
   }

   public void execute( )
   {
      cleanup();
   }

   public void gxep_procedureaks( )
   {
      initialize();
      initialized = (short)(1) ;
      /* procedureAKS Constructor */
      new com.idquilmes.procedureaks(remoteHandle, context).execute( ) ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short initialized ;
   protected short Gx_err ;
   protected String Gx_restmethod ;
}

