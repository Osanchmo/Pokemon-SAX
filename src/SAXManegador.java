import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


class SAXManegador extends DefaultHandler {

    List<Pokemon> pokimons = new ArrayList<>();


    private boolean is_nombre = false;
    private boolean is_PV = false;
    private boolean is_ataque1 = false;
    private boolean is_ataque2 = false;
    private boolean is_etapa = false;

    private String classe = "";
    private String nombre = "";
    private String PV = "";
    private String ataque1 = "";
    private String ataque2 = "";
    private String etapa = "";


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if(qName.equalsIgnoreCase("Nombre")) {
            is_nombre = true;
            classe = attributes.getValue(0);
        }
        else if(qName.equalsIgnoreCase("PV"))
            is_PV = true;
        else if(qName.equalsIgnoreCase("ataque1"))
            is_ataque1 = true;
        else if(qName.equalsIgnoreCase("ataque2"))
            is_ataque2 = true;
        else if(qName.equalsIgnoreCase("etapa"))
            is_etapa = true;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("Pokemon")){
            Pokemon mew = new Pokemon();
            mew.setNombre(nombre);
            mew.setPV(PV);
            mew.setAtaque1(ataque1);
            mew.setAtaque2(ataque2);
            mew.setEtapa(etapa);
            mew.setClasse(classe);
            pokimons.add(mew);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();
        if (value.length() == 0) return;
        if (is_nombre) {
            nombre = value;
            is_nombre = false;
        } else if (is_PV) {
            PV = value;
            is_PV = false;
        } else if (is_ataque1) {
            ataque1 = value;
            is_ataque1 = false;
        } else if (is_ataque2) {
            ataque2 = value;
            is_ataque2 = false;
        } else if (is_etapa) {
            etapa = value;
            is_etapa = false;
        }
    }

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {

    }
}
