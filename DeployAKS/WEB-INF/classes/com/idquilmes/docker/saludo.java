package com.idquilmes.docker ;
import com.idquilmes.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class saludo extends GXProcedure
{
   public saludo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( saludo.class ), "" );
   }

   public saludo( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      saludo.this.aP0 = aP0;
      saludo.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      saludo.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Mensaje = "Hola!" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = saludo.this.AV8Mensaje;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Mensaje = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Mensaje ;
   private String[] aP0 ;
}

