package CssParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.isep.langAndCompil.project.parsers.CSSLexer;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser.PropertyContext;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser.PropertyNameContext;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser.RegleContext;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser.ReglesContext;
import org.antlr.isep.langAndCompil.project.parsers.CSSParser.ValueContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main
{

    /**
     * 
     * @param cssfile
     *            the CSS file
     * @return a list of HashMaps, each map associating a css property (color,
     *         font size and font family are the three properties we have
     *         managed) and the number of times it is used in the whole CSS file
     * @throws IOException
     */
    public static List<Map<String, Integer>> getCSSInformation( File cssFile ) throws IOException
    {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> colorMap = new HashMap<String, Integer>();
        Map<String, Integer> fontSizeMap = new HashMap<String, Integer>();
        Map<String, Integer> fontMap = new HashMap<String, Integer>();
        list.add( 0, colorMap );
        list.add( 1, fontSizeMap );
        list.add( 2, fontMap );

        FileInputStream fis = new FileInputStream( cssFile );
        ANTLRInputStream input = new ANTLRInputStream( fis );
        CSSLexer lexer = new CSSLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        CSSParser parser = new CSSParser( tokens );

        ReglesContext regles = parser.regles();

        for ( RegleContext regle : regles.regle() )
        {
            for ( PropertyContext property : regle.property() )
            {
                PropertyNameContext propertyName = property.propertyName();
                String s_propertyName = propertyName.getText();
                ValueContext value = property.value();
                String s_value = value.getText();

                if ( "color".equals( s_propertyName ) || "background-color".equals( s_propertyName ) )
                {
                    if ( !colorMap.containsKey( s_value ) )
                    {
                        colorMap.put( s_value, 1 );
                    } else
                    {
                        Integer colorNumber = colorMap.get( s_value );
                        colorMap.put( s_value, ++colorNumber );
                    }
                } else if ( "font-size".equals( s_propertyName ) )
                {
                    if ( !fontSizeMap.containsKey( s_value ) )
                    {
                        fontSizeMap.put( s_value, 1 );
                    } else
                    {
                        Integer fontSizeNumber = fontSizeMap.get( s_value );
                        fontSizeMap.put( s_value, ++fontSizeNumber );
                    }
                } else if ( "font-family".equals( s_propertyName ) )
                {
                    if ( !fontMap.containsKey( s_value ) )
                    {
                        fontMap.put( s_value, 1 );
                    } else
                    {
                        Integer fontNumber = fontMap.get( s_value );
                        fontMap.put( s_value, ++fontNumber );
                    }
                }
            }
        }

        return list;
    }

    public static void main( String[] args ) throws Exception
    {
        File cssFile = new File( "inputcss.css" );

        List<Map<String, Integer>> list = Main.getCSSInformation( cssFile );
        Map<String, Integer> colorMap = (Map<String, Integer>) list.get( 0 );
        Map<String, Integer> fontSizeMap = (Map<String, Integer>) list.get( 1 );
        Map<String, Integer> fontMap = (Map<String, Integer>) list.get( 2 );

        for ( String mapKey : colorMap.keySet() )
        {
            System.out.println( "color:    " + mapKey + " --> " + colorMap.get( mapKey ) );
        }

        System.out.println( "" );

        for ( String mapKey : fontMap.keySet() )
        {
            System.out.println( "font:    " + mapKey + " --> " + fontMap.get( mapKey ) );
        }

        System.out.println( "" );

        for ( String mapKey : fontSizeMap.keySet() )
        {
            System.out.println( "font-size:    " + mapKey + " --> " + fontSizeMap.get( mapKey ) );
        }
    }

}
