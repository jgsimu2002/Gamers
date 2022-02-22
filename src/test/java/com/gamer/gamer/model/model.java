@data
@Entity
        @Table(name=cliente)
package com.gamer.gamer.model;

public class model {
        private static final log serialVersionUID = 1L;
    
    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
            private String nombre;
            private String apellidos;
            private String correo;
            private String telefono;
            
            public cliente() {
            }

    public cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
            
            
}
