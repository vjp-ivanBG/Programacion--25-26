/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author alumno
 */
public class bicicleta {
    //ATRIBUTOS
    int ruedas; //
    protected String manillar; //MAL
    private String pedales; //BIEN
    private String frenos;
    private boolean estaPedaleando;
    
    // Atributo estático que pertenece a la clase
    private static int numBicicletas = 0;
    
    // ATRIBUTO DE OTRA CLASE (Composición de clases)
    private Ciclista ciclista;
    
    // CONSTRUCTORES
    // Por defecto
    public void Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        // Incremetneamos el valor del atributo estático
        incrementarBicicletas();
        
        // 1.3 ¡IMPORTANTE! Inicializamos un ciclista por defecto (con el constructor por defecto)
        this.ciclista = new Ciclista();
    }   
    
    public void Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando, Ciclista ciclista) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
    }
    
    // GETTERS Y SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    public int getRuedas() {
        return this.ruedas;
    }
    
    public void setManillar() {
        this.manillar = manillar;
    }
    
    public String getManillar() {
        return this.manillar;
    }
    
    public void setPedales() {
        this.pedales = pedales;
}
    
    public String getPedales() {
        return this.pedales;
    }
 
    public void setFrenos() {
        this.frenos = frenos;
    }
    
    public String getFrenos() {
        return this.frenos;
    }
    
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    
    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
    
    public Ciclista getCiclista() {
        return this.ciclista;
    }
    
    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }
    
    public int getNumBicicletas() {
        return this.numBicicletas;
    }
    
    //MÉTODOS
    private void acelerar() {
        System.out.println("Acelerando...");
    }
    
    private static void incrementarBicicletas() {
        numBicicletas++;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.ruedas +
                ", un manillar" + this.manillar + 
                ", unos pedales" + this.pedales +
                ", unos frenos" + this.frenos +
                " y ahora ¿estoy pedaleando? " + this.estaPedaleando +
                this.ciclista.toString();
    }
}
