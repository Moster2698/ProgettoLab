package Exceptions;

import org.antlr.v4.runtime.ParserRuleContext;

public class CastException{

    public static void castException(String type, ParserRuleContext ctx){
        System.err.println("Errore di tipo!");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.err.println(ctx.getText());
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.err.println("> " + type +" expression expected.");
        System.exit(1);
    }
}
