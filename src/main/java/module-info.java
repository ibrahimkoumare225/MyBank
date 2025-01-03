module fr.koumare.mybank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;

    opens fr.koumare.mybank to javafx.fxml;
    exports fr.koumare.mybank;
    exports fr.koumare.mybank.controllers;
    exports fr.koumare.mybank.controllers.admin;
    exports fr.koumare.mybank.controllers.client;
    exports fr.koumare.mybank.models;
    exports fr.koumare.mybank.views;



}