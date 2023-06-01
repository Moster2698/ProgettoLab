import gen.ImpLexer;
import gen.ImpParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        ImpLexer lexer = new ImpLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ImpParser parser = new ImpParser(tokenStream);

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line,
                                    int charPositionInLine,
                                    String msg,
                                    RecognitionException e)
                    throws ParseCancellationException {
                System.err.println("Errore di sintassi");
                System.exit(1);
            }
        });

        try {
            ParseTree tree = parser.prog();
            IntImp interpreter = new IntImp(new Conf());
            interpreter.visit(tree);
        } catch (ParseCancellationException e) {
            System.err.println(e.getMessage());
        }
    }
}
