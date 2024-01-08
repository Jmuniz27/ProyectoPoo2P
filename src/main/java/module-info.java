module ec.edu.espol.proyectopoo2p {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.proyectopoo2p to javafx.fxml;
    exports ec.edu.espol.proyectopoo2p;
}
