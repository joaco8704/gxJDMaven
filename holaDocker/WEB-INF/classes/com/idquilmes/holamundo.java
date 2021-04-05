package com.idquilmes ;
import com.idquilmes.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class holamundo extends GXProcedure
{
   public holamundo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( holamundo.class ), "" );
   }

   public holamundo( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
      Gx_restmethod = ((HttpContext)(context.getHttpContext())).getRequestMethod() ;
   }

   public void execute( )
   {
      cleanup();
   }

   public void gxep_saludo( String [] arr_AV5Mensaje )
   {
      initialize();
      initialized = (short)(1) ;
      arr_AV5Mensaje[0] = this.AV5Mensaje;
      /* saludo Constructor */
      GXv_char1[0] = AV5Mensaje ;
      new com.idquilmes.docker.saludo(remoteHandle, context).execute( GXv_char1) ;
      this.AV5Mensaje = GXv_char1[0] ;
      arr_AV5Mensaje[0] = this.AV5Mensaje;
   }

   public void gxep_procedure1( )
   {
      initialize();
      initialized = (short)(1) ;
      /* Procedure1 Constructor */
      new com.idquilmes.docker.procedure1(remoteHandle, context).execute( ) ;
   }

   public void gxep_otroprocedure( )
   {
      initialize();
      initialized = (short)(1) ;
      /* otroProcedure Constructor */
      new com.idquilmes.docker.otroprocedure(remoteHandle, context).execute( ) ;
   }

   public void gxep_algomas( )
   {
      initialize();
      initialized = (short)(1) ;
      /* AlgoMas Constructor */
      new com.idquilmes.docker.algomas(remoteHandle, context).execute( ) ;
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
      AV5Mensaje = "" ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short initialized ;
   protected short Gx_err ;
   protected String Gx_restmethod ;
   protected String AV5Mensaje ;
   protected String GXv_char1[] ;
   protected String[] arr_AV5Mensaje ;
}

