public class Pokemon {

    private String classe = "";
    private String nombre = "";
    private String PV = "";
    private String Ataque1 = "";
    private String Ataque2 = "";
    private String Etapa = "";

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setPV(String PV) {
        this.PV = PV;
    }

    public void setAtaque1(String ataque1) {
        Ataque1 = ataque1;
    }

    public void setAtaque2(String ataque2) {
        Ataque2 = ataque2;
    }

    public void setEtapa(String etapa) {
        Etapa = etapa;
    }

    public String getClasse() {
        return classe;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPV() {
        return PV;
    }

    public String getAtaque1() {
        return Ataque1;
    }

    public String getAtaque2() {
        return Ataque2;
    }

    public String getEtapa() {
        return Etapa;
    }
}
