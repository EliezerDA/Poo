package herencia;

public class Empleado extends persona{

    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado(){

    }

    public Empleado(String apellido, String dni, String domicilio, int id, String nombre, String telefono, String cargo, int num_legajo, Double sueldo) {
        super(apellido, dni, domicilio, id, nombre, telefono);
        this.cargo = cargo;
        this.num_legajo = num_legajo;
        this.sueldo = sueldo;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
