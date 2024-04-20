module com.adr.proyectointegrador {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.adr.proyectointegrador to javafx.fxml;
    exports com.adr.proyectointegrador;
    exports com.adr.proyectointegrador.controllers;
    opens com.adr.proyectointegrador.controllers to javafx.fxml;
}