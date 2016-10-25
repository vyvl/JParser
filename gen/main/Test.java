package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by siddarthapeteti on 10/24/2016.
 */
public class Test
{
    public static void main(String[] args) throws IOException {
        InputStream is = new ByteArrayInputStream("{\"abc\":\"def\"}".getBytes());
        ANTLRInputStream inputStream = new ANTLRInputStream(is);
        JSONLexer jsonLexer = new JSONLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(jsonLexer);
        JSONParser parser = new JSONParser(tokens);
        ParseTree tree = parser.json();
        System.out.println(tree.toStringTree(parser));
    }
}
