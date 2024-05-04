public class CuentaBancaria {
    //#region Atributos
    String titular;
    String tipoDeCuenta;
    double saldo;
    int codigo;
    String libro;
    String autor; 
    String publicacion;
    //#endregion
    //#region MetodosSetterGetter
        // Método getter para establecer el código
        public int getCodigo() {
            return codigo;
        }
            // Método setter para establecer el código
        public void setCodigo(int nuevoCodigo) {
            codigo = nuevoCodigo;
        }
        public String getLibroString(){
            return libro;
        }
        public void setLibro(String nuevoLibroString){
            libro = nuevoLibroString;
        }
        public String getAutorString(){
            return autor;
        }
        public void setAutor(String nuevoAutorString){
            autor = nuevoAutorString;
        }
        public String getPublicacionString(){
            return publicacion;
        }
        public void setPublicacionString(String nuevoPublicacionString){
            publicacion = nuevoPublicacionString;
        }
    //#endregion
    //#region '''str'''
    // Método para obtener una representación de cadena de la instancia
    @Override
    public String toString() {
        return "borrar{" +
                "codigo: " + codigo +
                ", libro: " + libro +
                ", autor: " + autor +
                ", publicacion: " + publicacion +
                '}';
    }
    //#endregion
    }
