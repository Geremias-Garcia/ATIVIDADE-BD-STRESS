package ifpr.pgua.eic.exemplodatas.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.exemplodatas.model.repositories.Repositorio;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;

public class Principal {

    private Repositorio repositorio;

    public Principal(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    @FXML
    private void gerar() {
        Resultado resultado = repositorio.criar();
    }

}
