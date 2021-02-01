package compiler;

import gen.MoolaLexer;
import gen.MoolaListener;
import gen.MoolaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) throws IOException{
        CharStream stream = CharStreams.fromFileName("./sample/test2.mla");
        MoolaLexer lexer = new MoolaLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        MoolaParser parser = new MoolaParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program(); // root
        ParseTreeWalker walker = new ParseTreeWalker();
        MoolaListener listener = new SymbolTableGenerator();

        walker.walk(listener, tree);

    }
}
