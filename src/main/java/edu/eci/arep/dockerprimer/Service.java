package edu.eci.arep.dockerprimer;

public class Service {
    private DataBase baseDeDatos;

    public Service(){
        baseDeDatos = new DataBase();
    }

    /**
     * Consulta los datos de la base de datos
     * @return String
     */
    public String getData(){
        return baseDeDatos.consult();
    }

    /**
     * Inserta el nuevo mensage en la base de datos
     * @param message
     */
    public void insert(String message){
        baseDeDatos.insert(message);
    }
}
