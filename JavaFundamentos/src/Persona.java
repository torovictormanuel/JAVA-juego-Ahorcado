/*
 * 
 */

public class Persona {

    private Integer id;
    private String nombre;


    //Constructor (parametros: id de la persona ,nombre de la persona)

    public Persona(Integer id , String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
};
