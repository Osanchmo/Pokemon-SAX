import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main
{
    public static void main(String[] args) throws IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        InputStream xmlInput = new FileInputStream("pokemons.xml");

        try {

            SAXParser saxParser = factory.newSAXParser();
            SAXManegador handler = new SAXManegador();
            saxParser.parse(xmlInput, handler);
            tractarllista(handler);

        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
        private static void tractarllista(SAXManegador sax) {
            for (Pokemon p : sax.pokimons) {
                System.out.println("El Pokemon " + p.getNombre() + " de tipo " + p.getClasse() +" con " + p.getPV() + " PVs y" +
                        "\n con ataques: " + p.getAtaque1() + " y " + p.getAtaque2() + "\n fase: " + p.getEtapa() + "\n");
            }

        }
}

