module com.example.formulario_validacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formulario_validacion to javafx.fxml;
    exports com.example.formulario_validacion;
}