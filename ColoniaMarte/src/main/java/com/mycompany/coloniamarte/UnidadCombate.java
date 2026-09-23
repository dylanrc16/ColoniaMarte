/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylnr
 */
public abstract class UnidadCombate {
    public abstract class ComponenteCombate {
    private String ID;
    private String nombre;
    private int vidaMaxima;
    private int vidaActual;
    private int dano;
    private int frecuenciaAtaque;
    private int alcance;
    private int costoCapacidad;
    private int nivel;
    private int misionMinima;
    
    public void recibirDano(int danoRecibido) {
        vidaActual -= danoRecibido;

        if (vidaActual < 0) {
            vidaActual = 0;
        }
    }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getVidaMaxima() {
            return vidaMaxima;
        }

        public void setVidaMaxima(int vidaMaxima) {
            this.vidaMaxima = vidaMaxima;
        }

        public int getVidaActual() {
            return vidaActual;
        }

        public void setVidaActual(int vidaActual) {
            this.vidaActual = vidaActual;
        }

        public int getDano() {
            return dano;
        }

        public void setDano(int dano) {
            this.dano = dano;
        }

        public int getFrecuenciaAtaque() {
            return frecuenciaAtaque;
        }

        public void setFrecuenciaAtaque(int frecuenciaAtaque) {
            this.frecuenciaAtaque = frecuenciaAtaque;
        }

        public int getAlcance() {
            return alcance;
        }

        public void setAlcance(int alcance) {
            this.alcance = alcance;
        }

        public int getCostoCapacidad() {
            return costoCapacidad;
        }

        public void setCostoCapacidad(int costoCapacidad) {
            this.costoCapacidad = costoCapacidad;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        public int getMisionMinima() {
            return misionMinima;
        }

        public void setMisionMinima(int misionMinima) {
            this.misionMinima = misionMinima;
        }

    
    

    
}
    
}
