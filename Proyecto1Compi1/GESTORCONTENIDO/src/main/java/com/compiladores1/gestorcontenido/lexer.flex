/* codigo de usuario */
package com.compiladores1.gestorcontenido;

import java_cup.runtime.*;
import static com.compiladores1.gestorcontenido.sym.*;


%% //separador de area

/* opciones y declaraciones de jflex */

%class AnalizadorLexico
%public
%char
%unicode
%ignorecase
%cup
%line
%column

%init {
    yyline = 1;
    yychar = 1;
%init }

%{
        StringBuilder string = new StringBuilder();
  
        private Symbol symbol(int type) {
            return new Symbol(type, yyline+1, yycolumn+1);
        }

        private Symbol symbol(int type, Object value) {
            return new Symbol(type, yyline+1, yycolumn+1, value);
        }
%}

Salto   =   \r|\n|\r\n
Espacio =   {Salto}|[\t\f]

L   =   [a-zA-Z_]
D   =   0|[1-9][0-9]*

valor = [\"][A-Za-z]+[\"]
fecha = ([0-9]{4})[-](0[1-9]|1[1-2])[-](3[01]|[1|2][0-9]|0[1-9])

%%

<YYINITIAL> {
            "[" { return symbol(L_LLAVE);}
            "]" { return symbol(R_LLAVE);}

            {D}                         {   return new Symbol(ENTERO, yyline, yychar, yytext() );    }
            {L}({L}|{D})*           {  return symbol(ID, yyline, yychar, yytext() );    }
            {Espacio}               {   /*Ignorar*/ }
            {Salto}                  {  yychar=1;   }
            {fecha}                 {   return symbol(FECHA, yyline, yychar, yytext() );    }
            {valor}                 {   return symbol(VALOR, yyline, yychar, yytext() );  }

            "<acciones>"        { return symbol(ACCIONES_OPEN, yyline, yychar, yytext() ); }
            "</acciones>"   { return symbol(ACCIONES_CLOSE, yyline, yychar, yytext() ); }

            "<accion"       { return symbol(ACCION_OPEN, yyline, yychar, yytext() ); }
            "</accion>"     { return symbol(ACCION_CLOSE, yyline, yychar, yytext() ); }

            "<parametros>"  { return symbol(PARAMETROS_OPEN, yyline, yychar, yytext() ); }
            "</parametros>" { return symbol(PARAMETROS_CLOSE, yyline, yychar, yytext() ); }

            "<parametro"    { return symbol(PARAMETRO_OPEN, yyline, yychar, yytext() ); }
            "</parametro>"    { return symbol(PARAMETRO_CLOSE), yyline, yychar, yytext() ; }

            "<etiquetas>"   { return symbol(ETIQUETAS_OPEN, yyline, yychar, yytext() ); }
            "</etiquetas>"  { return symbol(ETIQUETAS_CLOSE, yyline, yychar, yytext() ); }

            "<etiqueta"     { return symbol(ETIQUETA_OPEN, yyline, yychar, yytext() ); }

            "nombre="     { return symbol(NOMBRE_OPEN, yyline, yychar, yytext() ); }
            "valor="      { return symbol(VALOR_OPEN, yyline, yychar, yytext() ); }
            ">"             { return symbol(GT, yyline, yychar, yytext() ); }
            "/>"               { return symbol(XML_TAG_CLOSE, yyline, yychar, yytext() ); }

            "\"nueva_pagina\""    { return symbol(ACCION_NP, yyline, yychar, yytext() );}

            "\"borrar_pagina\""    { return symbol(ACCION_DP, yyline, yychar, yytext() );}

            "\"modificar_pagina\""    { return symbol(ACCION_MP, yyline, yychar, yytext() );}

            "\"id\"" { return symbol(PR_ID, yyline, yychar, yytext() );}

            . {
                System.out.println("Este es un error lexico: "+yytext()+
                                               ", en la linea: "+yyline+", en la columna: "+yychar);
             }
}

. {
    System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yychar);
}
[^]                              {  throw new Error("Caracter invalido<"+ yytext()+">");    }
<<EOF>>                 { return symbol(EOF); }