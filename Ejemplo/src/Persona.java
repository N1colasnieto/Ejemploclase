import java.util.Objects;

public abstract class Persona {
    //Esto es un cambio en la clase persona

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String nacionalidad;

    public Persona(String nombre, String apellido, int edad, int dni, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String modificarEdad(int nuevaEdad)
    {
        String mensaje = "no fue posible cambair la edad";
        if(nuevaEdad>0 && nuevaEdad>edad)
        {
            edad=nuevaEdad;
            mensaje="edad cambiada con exito";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && Objects.equals(nacionalidad, persona.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nacionalidad);
    }

}
